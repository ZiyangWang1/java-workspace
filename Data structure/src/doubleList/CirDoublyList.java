package doubleList;

public class CirDoublyList<T> 
{
	public DoubleNode<T> head;
	
	public CirDoublyList()
	{
		this.head = new DoubleNode<T>();
		this.head.prev = this.head;
		this.head.next = this.head;
	}
	
	public CirDoublyList(T[] values)
	{
		this();
		DoubleNode<T> p;
		for(int i = 0;i<values.length;i++)
		{
			p = new DoubleNode<T>(values[i],head.prev,head);
			head.prev.next = p;
			head.prev = p;
		}
	}
	
	public CirDoublyList(CirDoublyList<T> list)
	{
		this();
		DoubleNode<T> p = this.head;
		for(DoubleNode<T> q = list.head.next;q!=list.head;q=q.next)
		{
			p.next = new DoubleNode<T>(q.data,p, this.head);
			p=p.next;
			this.head.prev = p;
		}
	}
	
	public boolean isEmpty()
	{
		return this.head.next == this.head;
	}
	
	public DoubleNode<T> insert(int i,T x)
	{
		if(x==null)
			throw new NullPointerException("x==null");
		DoubleNode<T> front = this.head;
		for(int j=0;front.next!=this.head&&j<i;j++)
			front = front.next;
		DoubleNode<T> q = new DoubleNode<T>(x,front,front.next);
		front.next.prev = q;
		front.next = q;
		return q;
	}
	
	public DoubleNode<T> insert(T x)
	{
		if(x==null)
			throw new NullPointerException("x==null");
		DoubleNode<T> q = new DoubleNode<T>(x,head.prev,head);
		head.prev.next = q;
		head.prev = q;
		return q;
	}
	
	public String toPreviousString()
	{
		String str=this.getClass().getName()+"("; 
		for (DoubleNode<T> p=this.head.prev; p!=this.head;  p=p.prev)
        {
            str += p.data.toString();
            if (p.prev!=this.head) 
                str += ",";
        }
        return str+")";    
	}
	
	public T removeLast()
	{
		DoubleNode<T> p = this.head.prev;
		if(p == this.head)
			return null;
		p.prev.next = this.head;
		this.head.prev = p.prev;
		return p.data;
	}
	
	public void replaceAll(CirDoublyList<T> pattern,CirDoublyList<T> list)
	{
		DoubleNode<T> plist = list.head.next;
		
		for(DoubleNode<T> pthis = this.head.next;pthis!=this.head;pthis=pthis.next)
			for(DoubleNode<T> ppattern = pattern.head;ppattern.next!=pattern.head;ppattern=ppattern.next)
			{
				plist = plist.next;
				if(pthis.data.equals(ppattern.next.data))
				{
					pthis.data = plist.data;
					ppattern.next = ppattern.next.next;
				}
			}
	}
	
}
