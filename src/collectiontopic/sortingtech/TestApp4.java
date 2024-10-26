package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Student s1  = new Student(1, "rahul", 12);
		Student s2  = new Student(2, "kunal", 10);
		Student s3  = new Student(3, "neel", 8);
		Student s4  = new Student(4, "ankur", 11);
		Student s5  = new Student(5, "sagar", 10);
		
		ArrayList<Student>list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student  s= list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName() +" " + s.getStd());
		}
		
		Collections.sort(list, new StdWiseStudentComparator());
		
		System.out.println("After Stdwise Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student  s= list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName() +" " + s.getStd());
		}
		
		
		Collections.sort(list, new NameWiseStudentComparator());
		
		System.out.println("After Namewise Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student  s= list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName() +" " + s.getStd());
		}
	}
}













