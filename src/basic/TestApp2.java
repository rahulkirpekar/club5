package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();	
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();	

		for(int i = no1 ; i<=no2 ; i++) 
		{
			int no = i;
			boolean flag = true;
			for(int j =2 ; j < no ; j++) 
			{
				if(no % j == 0) 
				{
					flag=false;
					break;
				}
			}
			if(flag && (no != 1)) 
			{
				System.out.println(no);
			}
		}
	}
}