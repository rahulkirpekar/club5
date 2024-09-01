package io.byteorientedway.stringtopic;

import java.io.FileInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\club5\\src\\io\\byteorientedway\\stringtopic\\TestApp1.java");

			// read---one by one byte---char
			int temp;
			while( (temp = fin.read())	!=  -1 ) 
			{
				sb.append((char)temp);
			}
			
			fin.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}