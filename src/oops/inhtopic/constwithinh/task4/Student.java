package oops.inhtopic.constwithinh.task4;

public class Student extends Person
{
	int rno,marks;
	
	public Student( int rno, String name,int marks) 
	{
		super(name);
		this.rno = rno;
		this.marks = marks;
	}
	public void disp() 
	{
		System.out.println(rno+" " + name+" " + marks);
	}
	public static void main(String[] args) 
	{
		Student s= new Student(1, "ankur", 10);
		
		s.disp();
	}
}
