package oops.inhtopic.si;

import java.util.Scanner;

public class Employee extends Person
{
	int id,salary;
	
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(id+" " + name+" " + salary);
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		
		e.scan();
		e.disp();
	}
}
