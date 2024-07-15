package oops.inhtopic.constwithinh.task1;

public class Employee extends Person
{
	int id;
	String dsgn,orgName;
	
	public Employee() 
	{
		System.out.println("Default Employee Constructor");

		id=1;
		dsgn="xyz";
		orgName = "yyy";
	}
	public Employee(int id,String name,String dsgn,String orgName) 
	{
		this.id=id;
		this.name=name;
		this.dsgn=dsgn;
		this.orgName=orgName;
	}
}
