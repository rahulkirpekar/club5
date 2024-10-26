package collectiontopic.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("rahul");//<===queue
		queue.add("ankur");
		queue.add("kunal");
		queue.add("dhaval");
		queue.add("ramesh");
		
		while(!queue.isEmpty()) 
		{
			String name = queue.poll();
			
			System.out.println(name);
		}
	}
}
