package oops.inhtopic.constwithinh.task3;

public class B extends A
{
	int no2;
	public B() 
	{
		System.out.println("Default(1) Child ");
		no2=20;
	}
	public B(int no1,int no2) 
	{
		super(no1);
		this.no2 = no2;
		System.out.println("Para(2) Child");
	}
}




