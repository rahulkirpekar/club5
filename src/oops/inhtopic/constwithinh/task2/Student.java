package oops.inhtopic.constwithinh.task2;

public class Student 
{
	int rno;
	String name;
	int std ;
	int marks;
	
	public Student() 
	{
		System.out.println("Student :: Default Constructor");
	}
	public Student(int rno, String name) 
	{
		this();
		this.rno = rno;
		this.name = name;
		System.out.println("Student(rno,name) :: Para Constructor");
	}
	public Student(int rno, String name, int std) 
	{
		this(rno,name);
		this.std = std;
		System.out.println("Student(rno,name,std) :: Para Constructor");
	}
	public Student(int rno, String name, int std, int marks) 
	{
		this(rno,name,std);
		this.marks = marks;
		System.out.println("Student(rno,name,std,marks) :: Para Constructor");
	}
	public void disp() 
	{
		System.out.println(rno+" " + name+" "  +std +" " + marks);
	}
	public static void main(String[] args) 
	{
		Student s= new Student(1, "rahul", 12, 90);
		s.disp();
	}
}
