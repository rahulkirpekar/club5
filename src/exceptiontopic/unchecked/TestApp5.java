package exceptiontopic.unchecked;

import java.io.IOException;
import java.util.Scanner;

public class TestApp5 
{
	public static void isValidForVote(int age) //throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception
			throw new InvalidAgeException("\n\"Invalid Age Exception\n\tPlease enter greter 18 value\"");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Age for Vote : "); 
		int age = sc.nextInt();//10
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("---------General Statements---------");
	}
}
