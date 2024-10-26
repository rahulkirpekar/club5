// 1) define package ---optional
package oops.basic;

// 2) import statements
import java.util.Scanner;

// 3) define class
public class Student 
{
	// 1) Dm's--Optional
	private int rno;
	private String name;
	private int std;
	
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
	public int getRno() 
	{
		return rno;
	}
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getStd() 
	{
		return std;
	}
	public void setStd(int std) 
	{
		this.std = std;
	}
}