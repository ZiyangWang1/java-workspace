package singlyList;

public class SinglyListTest
{
	public String[] letters = {"a","b","c","d","e","f"};

	public SinglyListTest()
	{
		SinglyList<String> s1;
		SinglyList<String> s2;
		s1 = new SinglyList<String>(letters);
		s2 = s1;
		System.out.print("s1 "+s1.toString()+"\n");
		System.out.print("s2 "+s2.toString()+"\n");
		s2 = new SinglyList<String>(s1);
		s1.remove(3);
		s2.remove(2);
		System.out.print("s1 "+s1.toString()+"\n");
		System.out.print("s2 "+s2.toString()+"\n");
		System.out.print("insersection "+s1.intersection(s2).toString()+"\n");

	}
	
	public static void main(String[] args) 
	{
		new SinglyListTest();

	}

}
