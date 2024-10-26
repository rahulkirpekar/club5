package collectiontopic.listtopic.altopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj = new ArrayList();
	
		listObj.add(true);//0----boolean---Boolean <==itr
		listObj.add(12);//1---int---Integer
		listObj.add("rahul");//2---String
		listObj.add(12);//3----int---Integer
		listObj.add(50L);//4---long---Long
		listObj.add(12.44345);//5---double---Double
		listObj.add(213.4532f);//6---float---Float
		listObj.add('r');//7---char---Character
		Student s = new Student(1, "Ved", 12);
		listObj.add(s);//8---s-object
		
		System.out.println("listObj.size() : " + listObj.size());

//--------------Traditional way--------------------------------		
		
		
		Iterator itr = listObj.iterator();
		
//		System.out.println("itr.hasNext() : " + itr.hasNext());
		
		
//		while(itr.hasNext()) 
//		{
//			Object obj = itr.next();
//			
//			if (obj instanceof Student) 
//			{
//				Student s1= (Student)obj;
//				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());	
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		
		
/*		
//--------------ForEach loop--------------------------------		
		for(Object obj	: listObj) 
		{
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println(s1.getRno() +" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println(obj);
			}
		}
//--------------simple for loop--------------------------------		
		for(int i = 0 ; i < listObj.size() ; i++) 
		{
			Object obj = listObj.get(i);
			
//			System.out.println(obj);
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println("===>"+s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			}else 
			{
				System.out.println(obj);
			}
		}
*/		
	}
}
