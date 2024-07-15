package oops.inhtopic.hi;

import java.util.Scanner;

public class Employee extends Person
{
	int id,salary;
	String dsgn,orgname;
	public void scanData() 
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
		System.out.println("Enter OrgName : ");
		orgname = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary +" " + dsgn+" " + orgname);
	}
}
