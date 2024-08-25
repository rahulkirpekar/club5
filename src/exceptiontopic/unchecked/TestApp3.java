package exceptiontopic.unchecked;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0 ;
		
		// Nested try..catch Block
			try 
			{
				try 
				{
					ans  = no1 / no2;// raised exception---no2--0
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				try 
				{
					String name = "";
					System.out.println("name.length() : " + name.length());

				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				try 
				{
					int a[] = new int[5];
					a[4] = 100;
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				
				try 
				{
					String a1 = "royal";//name.length()---5
					System.out.println(a1.charAt(a1.length()));// StringIndexOutoofBoundException
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			catch(Exception e) 
			{
				System.out.println("In Catch Block ---Exception Handled By Catch Block");
				e.printStackTrace();
			}
	}
}
