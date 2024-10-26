package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String>nameList = new ArrayList<String>();
		
		nameList.add("rakesh");
		nameList.add("sagar");
		nameList.add("ankur");
		nameList.add("rahul");
		nameList.add("neel");
		nameList.add("yash");
		nameList.add("kunal");
		
		for (int i = 0; i < nameList.size(); i++) 
		{
			String name = nameList.get(i);
			
			System.out.println(name);
		}
		
		Collections.sort(nameList);
		
		System.out.println("After Sorting : ");
		for (int i = 0; i < nameList.size(); i++) 
		{
			String name = nameList.get(i);
			
			System.out.println(name);
		}
	}
}
