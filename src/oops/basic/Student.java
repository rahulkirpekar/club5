// 1) define package ---optional
package oops.basic;

// 2) import statements
import java.util.Scanner;

// 3) define class
public class Student 
{
	// 1) Dm's--Optional
	int rno;
	String name;
	int std;
	
	// 2) mf's--Optional
	public void scanData() 
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
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
	
}
