package innerclass.li;

public class A 
{
	int no = 100;
	
	void disp() 
	{
		// Local Innerclass
		class B
		{
			void show() 
			{
				System.out.println("NO : " + no);
			}
		}
		B obj = new  B();
		obj.show();
	}
	public static void main(String[] args) 
	{
		A obj = new A();
		
		obj.disp();
	}
}