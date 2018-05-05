package singlyList;

public class Node<T>                      //������ڵ��࣬Tָ������Ԫ������
{
	public T data;                        //����Ԥ���洢����Ԫ��
	public Node<T> next;                  //��ַ�����ú�̽��
	public Node(T data, Node<T> next)     //�����㣬dataָ������Ԫ�أ�nextָ����̽ڵ�
	{
		this.data = data;
		this.next = next;
	}
	public Node()
	{
		this(null,null);
	}
	public String toString()              //���ؽ��������������ַ���
	{
		return this.data.toString();
	}

}
