package binarytrees;

public class BinaryTreeTest 
{
	String[] prelist = {"A","B","D",null,"G",null,null,null,"C","E",null,null,"F","H"};
	String[] Patternlist = {"D","I",null,null,"G"};
	
	public BinaryTreeTest()
	{
		BinaryTree<String> t1 = new BinaryTree<String>(prelist);
		BinaryTree<String> pattern = new BinaryTree<String>(Patternlist);
		t1.preorderTraverse();
		pattern.preorderTraverse();
		t1.insert(t1.root.left.left, "I", true);
		t1.preorderTraverse();
		t1.removeAllMatched(pattern);
		t1.preorderTraverse();
	}
	
	public static void main(String[] args) 
	{
		new BinaryTreeTest();

	}

}
