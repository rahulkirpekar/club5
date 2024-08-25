package exceptiontopic.unchecked;

import java.io.IOException;

class A1 
{
	void test1() throws  IOException  
	{
		
	}
}
public class B1 extends A1
{
	void test1() throws Exception 
	{
		
	}
}
