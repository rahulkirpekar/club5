package innerclass.ni;

public class A 
{
	private static int no = 10;
	
	// Nestedclass
	static class B
	{
		void disp() 
		{
			System.out.println("No : " + no);
		}
	}

	public static void main(String[] args) 
	{
		A.B obj = new A.B();
		
		obj.disp();
	}
}
