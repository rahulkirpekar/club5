package oops.polymorphismtopic.cp;

//Method Overloadding Rule
//**************************
//1) argu count
//2) data type
//3) type pramotion rule

// Method Overloadding
public class TestApp1 
{
	public void addFun(long no1,long no2) 
	{
		System.out.println("addFun(long--twoargs) : " + (no1+no2));
	}
	public void addFun(float no1,float no2) 
	{
		System.out.println("addFun(float--twoargs) : " + (no1+no2));
	}
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(three args) : " + (no1+no2+no3));
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(four args) : " + (no1+no2+no3+no4));
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		obj.addFun('r', 'a');
	}
}

