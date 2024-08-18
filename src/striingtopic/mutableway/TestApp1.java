package striingtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		StringBuffer name1 = new StringBuffer("rahul");
		StringBuffer name2 = new StringBuffer("kirpekar");

		System.out.println(name1+"---"+name1.hashCode());
		System.out.println(name2+"---"+name2.hashCode());

		// Mutable Behaviour
		System.out.println(name1.append(name2));

		System.out.println("-------------------------------------");
		
		System.out.println(name1+"---"+name1.hashCode());
		System.out.println(name2+"---"+name2.hashCode());
	}
}
