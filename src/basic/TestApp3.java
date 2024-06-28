package basic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int l=2;
		boolean flag=true;
		
		for (int i = 1; i <=5; i++) 
		{
			for (int k = (5-i); k >=1 ; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i; ) 
			{
				int numberOne = l ;
				flag = true;
				for(int m = 2 ; m < numberOne ; m++) 
				{
					if(numberOne % m == 0) 
					{
						flag = false;
						break;
					}
				}
				if(flag) 
				{
					System.out.print(numberOne + " ");
					j++;
				}
				l++;
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) 
		{
			for (int k = (5-i); k >=1 ; k--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;) 
			{
				int no = l ;
				flag = true;
				for(int m = 2 ; m < no ; m++) 
				{
					if(no % m == 0) 
					{
						flag = false;
						break;
					}
				}
				if(flag) 
				{
					System.out.print(no + " ");
					j++;
				}
				l++;
			}
			System.out.println();
		}
	}
}
