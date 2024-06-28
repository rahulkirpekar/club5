package basic.arraytopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int no, l = 2 , m;
		
		boolean flag= true;
		
		int a[] = new int[20];
		
		for(int i = 0 ; i < a.length ; ) 
		{
			no = l;
			
			flag = true;
			
			for(m = 2; m < no ; m++) 
			{
				if(no % m == 0) 
				{
					flag= false;
					break;
				}
			}
			if(flag) 
			{
				a[i] = no;
				i++;
			}
			l++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"] : " + a[i]);
		}
	}
}
