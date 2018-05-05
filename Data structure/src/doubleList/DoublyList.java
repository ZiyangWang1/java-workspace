package doubleList;

public class DoublyList<T> 
{
	public DoubleNode<T> head;
	
	public DoublyList()
	{
		this.head = new DoubleNode<T>();
		this.head.prev = null;
		this.head.next = null;
	}

}
