package oops.inhtopic.constwithinh.task1;

public class Person 
{
	String name;
	
	Person()
	{
		System.out.println("Default Person Constructor");
		name = "abc";
	}
	Person(String name)
	{
		this.name=name;
	}
}
