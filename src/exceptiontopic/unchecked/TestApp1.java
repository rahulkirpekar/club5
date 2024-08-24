package exceptiontopic.unchecked;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		===> ArithmeticException
		
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter No1 : ");
//		int no1 = sc.nextInt();
//		System.out.println("Enter No2 : ");
//		int no2 = sc.nextInt();
//		int ans = no1 / no2;// raised exception---no2--0
//		System.out.println("Addition : " + ans);
		
		
//		===> ArrayIndexOufofBoundException

//		int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
//		
//		a[5] = 10;//raised exception--->ArrayIndexOufofBoundException
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println("A["+i+"] : " + a[i]);
//		}
		
//		===> StringIndexOufofBoundException
		//			   01234
//		String name = "royal";//name.length()---5
//		System.out.println(name.charAt(name.length()));// StringIndexOutoofBoundException
		
		
//		===> NullPointerException	
//		String name = null;
//		System.out.println("name.length() : " + name.length()); // NullPointerException
		
//		===> NumberFormateException
		
//		String value ="1a0";

//		System.out.println("value+100 : " + (value+100));
		
		//		String--->int value convert
//		int no = Integer.parseInt(value);//NumberFormateException
		
//		System.out.println("No+100 : " + (no+100));
		
//		===> ClassCastException	
/*		
				A
				|	
		----------------
		B				C
 */		
		A obj = new A();
		
		obj = new B();

		C obj1 = (C)obj;//ClassCastException
		
	}
}
class A{}
class B extends A{}
class C extends A{}











