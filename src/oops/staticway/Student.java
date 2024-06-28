package oops.staticway;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	static String schoolName;
	
	public static void setSchoolName() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SchoolName : ");
		schoolName = sc.nextLine();
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName();
//		
//		Student s[] = new Student[5];
//		
//		for (int i = 0; i < s.length; i++) 
//		{
//			s[i] = new Student();
//			s[i].scan();
//		}
//		for (int i = 0; i < s.length; i++) 
//		{
//			s[i].disp();
//		}
	}
	private void disp() 
	{
		System.out.println(rno+" " + name+" " + std+" " + schoolName+"---"+schoolName.hashCode());
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
}
