package io.byteorientedway.stringtopic;

import java.io.File;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		File file = new File
		
		boolean flag = false;
		
		try 
		{
			flag = file.createNewFile();
			
			if (flag)
			{
				System.out.println("File created : " + file.getName());
				
			} else 
			{
				System.out.println("File not created");
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
