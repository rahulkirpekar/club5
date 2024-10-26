package multithreadtopic.bythread;

// 1) By extending Thread class:-

public class MyThread1 extends Thread
{
	// Thread---job defined in run() method
	@Override
	public void run() 
	{
//		System.out.println("Hi I am Thread----" + Thread.currentThread().getName());
		
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Hi I am Daemon Thread ---"+Thread.currentThread().getName());
			
		}else 
		{		
			for (int i = 1; i <=5; i++) 
			{
				try 
				{
					Thread.sleep(500);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getId()	+"---"+Thread.currentThread().getName() + "----" + i);
			}
		}	
	}
	
	public static void main(String[] args) 
	{
//		System.out.println("main method : " + Thread.currentThread().getName());
		
		
		MyThread1 th1  = new MyThread1();
		MyThread1 th2  = new MyThread1();
		MyThread1 th3  = new MyThread1();
		MyThread1 th4  = new MyThread1();
		MyThread1 th5  = new MyThread1();
	
		
		th1.setName("C Language");
		th2.setName("C++ Language");
		th3.setName("Java Language");
		th4.setName("Python Language");
		th5.setName("Scala Language");
		
		
		th1.setPriority(MAX_PRIORITY);
		th2.setPriority(NORM_PRIORITY);
		th3.setPriority(NORM_PRIORITY);
		th4.setPriority(NORM_PRIORITY);
		th5.setPriority(NORM_PRIORITY);
		
		th1.setDaemon(true);

		th1.start();

//		try 
//		{
////			th1.join();
//			th1.join(1000);
//			
//		} catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
		
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}