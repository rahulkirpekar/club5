package io.byteorientedway.stringtopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12, 90);
		
		// AutoClosable Resource
		try
			(
					FileOutputStream fout = new FileOutputStream("studentrecord.txt");
					
					ObjectOutputStream out = new ObjectOutputStream(fout);
			) 
		{
			
			out.writeObject(s1);
		
			System.out.println("success");
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
