package oops.basic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// 1) Memory allocation
		// 2) JVM--default constructor-set default values
		Employee e1 = new Employee(1, "Kenil", 120000, "SE");
		Employee e2 = new Employee(2, "Rakesh", 320000, "CA");
		
		e1.dispData();
		e2.dispData();
		
		
//		e2--->copy----e3
		
		Employee e3 = new Employee(e2);
		
		e3.dispData();
		
		
	}
}
