package striingtopic.immutableway;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter Name1 : ");
		String name1 = sc.nextLine();//rahul
		System.out.println("Enter Name2 : ");
		String name2 = sc.nextLine();//kirpekar

		name1 = name1.concat(" ");// "rahul "
		
		String fullName = name1.concat(name2);//rahul kirpekar
		
		System.out.println("fullName : " + fullName);
		
		// same-0 / -1 +1
//		int flag = name1.compareTo(name2);
//		if (flag==0) 
//		{
//			System.out.println("Both names are same");	
//		} else 
//		{
//			System.out.println("Both names are not same");	
//		} 
	}
}
