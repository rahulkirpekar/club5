package striingtopic.immutableway;

public class TestApp2
{
	public static void main(String[] args) 
	{
		String name1 ="royal";
		String name2 ="techno";
		
		System.out.println(name1.hashCode() + "---" + name1);
		System.out.println(name2.hashCode() + "---" + name2);
		
		
		// immutable behaviour
		name1 = name1.concat(name2);//royal techno
		
		
		System.out.println(name1.hashCode() + "---" + name1);
		System.out.println(name2.hashCode() + "---" + name2);
		
		
	}
}
