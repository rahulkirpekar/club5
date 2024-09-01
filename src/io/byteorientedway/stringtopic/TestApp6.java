package io.byteorientedway.stringtopic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		
		try 
			(
					FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\club5\\studentrecord.txt");
					ObjectInputStream oin  = new ObjectInputStream(fin);		
			)
		{
			
			Student s = (Student)oin.readObject();
			
			System.out.println("s===>"+s);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		
		
		} catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}
}
