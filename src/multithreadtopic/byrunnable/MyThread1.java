package multithreadtopic.byrunnable;

//2) By implementing Runnable interface
public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("HI I am Thread---"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
