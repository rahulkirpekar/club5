package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList marksList = new ArrayList();
		
		marksList.add(50);
		marksList.add(40.345);
		marksList.add(80.34f);
		marksList.add('r');
		marksList.add("royal");
		marksList.add(true);
		marksList.add(28);
		
		for (int i = 0; i < marksList.size(); i++) 
		{
			Object value = marksList.get(i);
			
			System.out.println(value);
		}
		
		Collections.sort(marksList);
		
		System.out.println("After Sorting : ");
		for (int i = 0; i < marksList.size(); i++) 
		{
			Object value = marksList.get(i);
			
			System.out.println(value);
		}
	}
}
