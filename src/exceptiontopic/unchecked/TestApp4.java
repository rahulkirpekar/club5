package exceptiontopic.unchecked;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();

		int ans = 0 ;
		
		// Multiple catch Block
/*		try 
		{
			ans  = no1 / no2;// raised exception---no2--0
			
		}
		catch(NullPointerException e) 
		{
			System.out.println("In Catch Block ---ArithmeticException Handled By Catch Block");
			e.printStackTrace();
			
		}finally 
		{
			// db connection / socket / file connection -- -closes
			System.out.println("Finally Block");
		}	*/

		try 
		{
			try 
			{
				ans  = no1 / no2;// raised exception---no2--0
			} catch (Exception e) 
			{
				e.printStackTrace();
			}finally 
			{
				System.out.println("Nested finally block---1");
			}
			
		}catch(ArithmeticException e) 
		{
			e.printStackTrace();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			// db connection / socket / file connection -- -closes
			System.out.println("Outer finally block---2");
		}	
		
		System.out.println("General Statements");
	}
}