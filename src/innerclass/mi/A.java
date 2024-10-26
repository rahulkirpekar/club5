package innerclass.mi;

// Member Innerclass
public class A 
{
	private int no = 100;
	
	// Member Innerclass--->A
	class B
	{
		void disp() 
		{
			System.out.println("No : " + no);
		}
	}

	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB = objA. new B();
		
		objB.disp();
	}
}
