package oops.inhtopic.constwithinh.task1;

public class TechEmployee extends Employee
{
	int salary;
	public TechEmployee() 
	{
		System.out.println("Default TechEmployee Constructor");

		salary=0;
	}
	public TechEmployee(int id,String name,int salary,String dsgn,String orgName) 
	{
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
		TechEmployee techEmp = new TechEmployee();
		
		techEmp.disp();
	}
}
