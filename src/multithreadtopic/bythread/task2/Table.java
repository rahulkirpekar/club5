package multithreadtopic.bythread.task2;

public class Table 
{
	//[synchronized]---[Threadsafe]--At time One single thread execute this method

	public synchronized void printTable(int no) 
	{
		for (int i = 1; i <=10; i++) 
		{
			try 
			{
				
				Thread.sleep(500);
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()  +"---"+no+" * " + i +" = " + (no*i));
		}
	}
}
