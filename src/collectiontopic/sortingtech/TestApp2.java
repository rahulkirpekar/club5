package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>marksList = new ArrayList<Integer>();
		
		marksList.add(50);
		marksList.add(40);
		marksList.add(80);
		marksList.add(20);
		marksList.add(10);
		marksList.add(34);
		marksList.add(28);
		
		for (int i = 0; i < marksList.size(); i++) 
		{
			Integer value = marksList.get(i);
			
			System.out.println(value);
		}
		
		Collections.sort(marksList);
		
		System.out.println("After Sorting : ");
		for (int i = 0; i < marksList.size(); i++) 
		{
			Integer value = marksList.get(i);
			
			System.out.println(value);
		}
	}
}
