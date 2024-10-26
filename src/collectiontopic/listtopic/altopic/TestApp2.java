package collectiontopic.listtopic.altopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		int--->Integer
		// nameList---TypeSafe<---Generic
		ArrayList<String>nameList = new ArrayList<String>();
		
		nameList.add("rahul");
		nameList.add("ankur");
		nameList.add("rakesh");
		nameList.add("ramesh");
		
		Iterator<String> itr = nameList.iterator();
		
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
