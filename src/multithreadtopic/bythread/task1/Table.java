package multithreadtopic.bythread.task1;

public class Table 
{
	public void printTable(int no) 
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
