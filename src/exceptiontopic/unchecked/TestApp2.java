package exceptiontopic.unchecked;

import java.util.Scanner;

public class TestApp2 
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
		try 
		{
			ans  = no1 / no2;// raised exception---no2--0
			
			String name = "";
			System.out.println("name.length() : " + name.length());
		
			int a[] = new int[5];
			a[4] = 100;
			
			
			String a1 = "royal";//name.length()---5
			System.out.println(a1.charAt(a1.length()));// StringIndexOutoofBoundException
			
		}
/*		
		catch(ArithmeticException e) 
		{
			System.out.println("In Catch Block ---ArithmeticException Handled By Catch Block");
			e.printStackTrace();
			
		}catch(NullPointerException e) 
		{
			System.out.println("In Catch Block ---NullPointerException Handled By Catch Block");
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("In Catch Block ---ArrayIndexOutOfBoundsException Handled By Catch Block");
			e.printStackTrace();
		}catch(Exception e) 
		{
			System.out.println("In Catch Block ---Exception Handled By Catch Block");
			e.printStackTrace();
		}
*/
		
		// Java---7 |

		catch(ArithmeticException |NullPointerException | ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("In Catch Block ---" + e.getClass().getName() +" Handled By Catch Block");
			e.printStackTrace();
		}catch(Exception e) 
		{
			System.out.println("In Catch Block ---Exception Handled By Catch Block");
			e.printStackTrace();
		}

		
		System.out.println("Addition : " + ans);
	}
}