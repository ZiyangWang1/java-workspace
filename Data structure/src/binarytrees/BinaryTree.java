package binarytrees;

public class BinaryTree<T> 
{
	public BinaryNode<T> root;
	
	public BinaryTree()
	{
		this.root = null;
	}
	
	public BinaryTree(T[] prelist)
	{
		this.root = create(prelist,this.root);
	}
	
	private int i = 0;
	
	private BinaryNode<T> create(T[] prelist,BinaryNode<T> parent)
	{
		BinaryNode<T> p = null;
		if(i<prelist.length)
		{
			T elem = prelist[i];
			i++;
			if(elem!=null)
			{
				p = new BinaryNode<T>(elem,parent,null,null);
				p.left = create(prelist,p);
				p.right = create(prelist,p);
			}
		}
		return p;
	}
	
	public boolean isEmpty()
	{
		return this.root == null;
	}
	
	public BinaryNode<T> insert(BinaryNode<T> parent,T x,boolean leftChild)
	{
		if(x == null)
			return null;
		if(leftChild)
		{
			parent.left.parent = new BinaryNode<T>(x,parent,parent.left,null);
			return parent.left = parent.left.parent;
		}
		parent.right.parent = new BinaryNode<T>(x,parent,null,parent.right);
		return parent.right = parent.right.parent;
	}
	
	public void remove(BinaryNode<T> parent,boolean leftChild)
	{
		if(leftChild)
			parent.left = null;
		else
			parent.right = null;
	}
	
	public void clear()
	{
		this.root = null;
	}
	
	public void preorder()
	{
		preorder(this.root);
		System.out.println();
	}
	
	private void preorder(BinaryNode<T> p)
	{
		if(p!=null)
		{
			System.out.print(p.data.toString()+" ");
			preorder(p.left);
			preorder(p.right);
		}
	}
	
	
}