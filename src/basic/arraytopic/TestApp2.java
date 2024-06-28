package basic.arraytopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);;
		
		int a[] = new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter Search value : ");
		
		int searchVal = sc.nextInt();
		
		boolean flag = false;
		
		int i ;
		for (i = 0; i < a.length; i++) 
		{
			if(searchVal == a[i]) 
			{
				flag = true;
				break;
			}
		}
		if(flag == true) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}else 
		{
			System.out.println("Search Value not found in array");
		}
	}
}