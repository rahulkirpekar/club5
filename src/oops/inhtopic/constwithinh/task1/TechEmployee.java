package oops.inhtopic.constwithinh.task1;

public class TechEmployee extends Employee
{
	int salary;
	public TechEmployee() 
	{
		System.out.println("Default TechEmployee Constructor");

		salary=0;
	}
	public TechEmployee(int id,String name) 
	{
		System.out.println("TechEmployee Para -- public TechEmployee(int id,String name) ");
		this.id=id;
		this.name=name;
	}
	public TechEmployee(int id,String name,int salary) 
	{
		System.out.println("TechEmployee Para -- public TechEmployee(int id,String name,int salary) ");
		this.id=id;
		this.name=name;
		this.salary = salary;
	}
	public TechEmployee(int id,String name,int salary,String dsgn) 
	{
		System.out.println("TechEmployee Para -- public TechEmployee(int id,String name,int salary,String dsgn) ");
		this.id=id;
		this.name=name;
		this.salary = salary;
		this.dsgn=dsgn;
	}
	public TechEmployee(int id,String name,int salary,String dsgn,String orgName) 
	{
		System.out.println("TechEmployee Para -- public TechEmployee(int id,String name,int salary,String dsgn,String orgName) ");
		this.id=id;
		this.name=name;
		this.salary = salary;
		this.dsgn=dsgn;
		this.orgName=orgName;
	}
	public void disp() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + orgName);
	}
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee(1,"rahul");
		
		techEmp.disp();
	}
}
