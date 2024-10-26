package collectiontopic.settopic;

import java.util.TreeSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> setObj = new TreeSet<String>();
		
		setObj.add("rahul");
		setObj.add("ankur");
		setObj.add("rahul");
		setObj.add("rakesh");
		setObj.add("sagar");
		setObj.add("kunal");
		setObj.add("ramesh");
		setObj.add("sagar");
		setObj.add("sujal");
		setObj.add("kunal");
		
		Iterator<String> itr =	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = itr.next();
			
			System.out.println(name);
		}
	}
}
