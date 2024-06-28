package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static boolean isPalindrome(int no) 
	{
		int rev=0,temp,dup;
		
		dup = no;
		
		while(no > 0) 
		{
			temp = no % 10;
			
			rev = (rev*10) + temp;
			
			no = no / 10;
		}
		
		return (rev == dup) ? true : false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int pc = 0;
		for (int i = no1; i <=no2; i++) 
		{
			if(isPalindrome(i)) 
			{
				System.out.print(i+" ");
				pc++;	
			}
		}
		System.out.print("\nPalindrome count : " + pc);
	}
}
