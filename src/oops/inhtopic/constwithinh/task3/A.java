package oops.inhtopic.constwithinh.task3;

public class A 
{
	int no1;
	A()
	{
		System.out.println("Default(1) Parent ");
		no1=10;
	}
	public A(int no1) 
	{
		System.out.println("Para(2) Parent ");
		this.no1 = no1;
	}
}
