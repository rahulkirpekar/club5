package io.byteorientedway.stringtopic;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
		
		try
			(
					FileOutputStream fout = new FileOutputStream("royallist.txt");
					ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s);
			
		}catch(Exception e ) 
		{
			e.printStackTrace();
		}
	}
}