package collectiontopic.listtopic.altopic;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "rahul",12);
		Student s2= new Student(2, "ankur",10);
		Student s3= new Student(3, "rakesh",12);
		Student s4= new Student(4, "Jignesh",11);
		Student s5= new Student(5, "sagar",10);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		boolean flag =  true;
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			
			if (s.getName().equals(name)) 
			{
				flag = false;
				
				Student sobj= new Student();
				sobj.setRno(s.getRno());
				sobj.scan();
				
				// Update
				list.set(i, sobj);
				System.out.println("success Updated  : " + i);
			}
		}
		if (flag) 
		{
			System.out.println(name + " not found in student list.");
		}
		for (int i = 0; i < list.size(); i++) 
		{
			Student sone = list.get(i);
			System.out.println(sone.getRno()+" " + sone.getName()+" " + sone.getStd());
		}
	}//end--delete
}