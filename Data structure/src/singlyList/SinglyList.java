package singlyList;

public class SinglyList<T> 
{
	public Node<T> head;
	
	public SinglyList()
	{
		this.head = new Node<T>();
	}
	
	public SinglyList(T[] values)
	{
		this();
		Node<T>rear = this.head;
		for(int i=0;i<values.length;i++)
		{
			rear.next = new Node<T>(values[i],null);
			rear = rear.next;
		}
	}
	
	public SinglyList(SinglyList<T> list)
	{
		this.head = new Node<T>();
		Node<T> p = this.head;
		for(Node<T> q = list.head.next;q!=null;q=q.next)
		{
			p.next = new Node<T>(q.data,null);
			p=p.next;
		}
	}
	
	public boolean isEmpty()
	{
		return this.head.next == null;
	}
	
	public T get(int i)
	{
		Node<T> p = this.head.next;
		for(int j=0;p!=null&&j<i;j++)
			p = p.next;
		return (i>=0&&p!=null)? p.data:null;
	}
	
	public String toString()
	{
		String str = this.getClass().getName()+"(";
		for(Node<T> p = this.head.next;p!=null;p = p.next)
		{ 
			str += p.data.toString();
			if(p.next!=null)
				str += ",";
		}
		return str + ")";
	}
	
	public Node<T> insert(int i,T x)
	{
		if(x == null)
			throw new NullPointerException("x == null");
		Node<T> front = this.head;
		for(int j=0;front.next!=null&&j<i;j++)
			front = front.next;
		front.next = new Node<T>(x,front.next);
		return front.next;
	}
	
	public Node<T> insert(T x)
	{
		return insert(Integer.MAX_VALUE,x);
	}
	
	public T remove(int i)
	{
		Node<T> front = this.head;
		for(int j=0;front.next!= null&&j<i;j++)
			front = front.next;
		if(i>=0&&front.next!=null)
		{
			T old = front.next.data;
			front.next = front.next.next;
			return old;
		}
		return null;
	}
	
	public void clear()
	{
		this.head.next = null;
	}
	
	public int size()
	{
		int size = 0;
		for(Node<T> p = this.head.next;p!=null;p=p.next)
			size++;
		return size;
	}
	
	public SinglyList<T> intersection(SinglyList<T> list)
	{
		SinglyList<T> result = new SinglyList<T>();
		SinglyList<T> target = new SinglyList<T>(list);
		
		for(Node<T> pthis = this.head.next;pthis!=null;pthis=pthis.next)
			for(Node<T> phtarget = target.head;phtarget.next!=null;phtarget=phtarget.next)
				if(pthis.data.equals(phtarget.next.data))
				{
					result.insert(pthis.data);
					if(phtarget.next.next != null)
						phtarget.next = phtarget.next.next;
				}
		return result;
	}

}
