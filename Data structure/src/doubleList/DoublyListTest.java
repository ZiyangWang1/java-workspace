package doubleList;

public class DoublyListTest 
{
	public String[] letters = {"a","b","c","d"};
	public String[] numbers = {"1","2","3","4"};

	public DoublyListTest()
	{
		CirDoublyList<String> d1 = new CirDoublyList<String>(letters);
		CirDoublyList<String> d2 = new CirDoublyList<String>(d1);
		CirDoublyList<String> d3 = new CirDoublyList<String>(numbers);
		System.out.print("d1 "+d1.toPreviousString()+"\n");
		System.out.print("d2 "+d2.toPreviousString()+"\n");
		System.out.print("d1 remove: "+d1.removeLast()+"\n");
		System.out.print("d2 remove: "+d2.removeLast()+","+d2.removeLast()+"\n");
		System.out.print("d1 "+d1.toPreviousString()+"\n");
		System.out.print("d2 "+d2.toPreviousString()+"\n");
		System.out.print("d3 "+d3.toPreviousString()+"\n");
		d1.replaceAll(d2, d3);
		System.out.print("d1 "+d1.toPreviousString()+"\n");
		
		
	}
	public static void main(String[] args) 
	{
		new DoublyListTest();
	}

}
