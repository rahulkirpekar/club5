package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> mapObj = new TreeMap<>();
		
//		map--K,V----> Entry
		
		mapObj.put(5, "rahul");
		mapObj.put(1, "rahul");//<==
		mapObj.put(4, "sagar");
		mapObj.put(3, "rakesh");
		mapObj.put(2, "ankur");
		
//		System.out.println(mapObj.keySet());
//		System.out.println(mapObj.values());
		
		for( Map.Entry<Integer, String>  e	 : mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
