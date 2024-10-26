package io.byteorientedway.stringtopic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		
		try
		(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\club5\\royallist.txt");
				
				ObjectInputStream oin = new  ObjectInputStream(fin);
		)
		{
			
//			Object obj = oin.readObject();
//			Student s[] = (Student[])obj;
//---------------------------------------------------------				
			Student s[] = (Student[])oin.readObject();

			for (int i = 0; i < s.length; i++) 
			{
				s[i].dispData();
			}
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}