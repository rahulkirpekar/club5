package oops.basic;

import java.util.Scanner;

public class Employee 
{
/*	scope
	-----
		1) private - within class
		2) protected
		3) public - can access everywhere
		
		4) Java Default scope
	
*/	
	
	// private - Within class
	
	// 1) Dm's
	private int id;//0
	private String name;//null
	private int salary;//0
	private String dsgn;//null

//	Employee()
//	{
//		System.out.println("START :: Default Construtcor----------"+this);
//		System.out.println(id +" " + name+" " + salary +" " + dsgn);
//		
//		id=1;
//		name="rahul";
//		salary=12000;
//		dsgn="SE";
//
//		System.out.println(id +" " + name+" " + salary +" " + dsgn);
//		
//		System.out.println("EXIT :: Default Construtcor");
//	}
	
	// Parameterised Constructor
	public Employee(int id,String name,int salary,String dsgn) 
	{
		System.out.println("START :: Parameterised Construtcor");
		System.out.println(this.id +" " + this.name+" " + this.salary +" " + this.dsgn);
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		
		System.out.println(this.id +" " + this.name+" " + this.salary +" " + this.dsgn);
		System.out.println("EXIT :: Parameterised Construtcor");
	}
	
//	// Copy Constructor
//	public Employee(Employee e) 
//	{
//		System.out.println("START :: Copy Construtcor");
//		System.out.println(this.id +" " + this.name+" " + this.salary +" " + this.dsgn);
//		
//		id = e.id;
//		name = e.name;
//		salary = e.salary;
//		dsgn = e.dsgn;
//		
//		System.out.println(this.id +" " + this.name+" " + this.salary +" " + this.dsgn);
//		System.out.println("EXIT :: Copy Construtcor");
//	}
	void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
	}
	void dispData() 
	{
		System.out.println(id +" " + name+" " + salary +" " + dsgn + "----------"+this);
	}
}