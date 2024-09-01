package io.byteorientedway.stringtopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name=  sc.nextLine();
		
		byte b[] = name.getBytes();
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("stringbyte.txt");
		
			//operation--write/read on file
			
			fout.write(b);

			fout.close();
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
}
