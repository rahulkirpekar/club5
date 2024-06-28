package oops.basic;

public class TestApp1 
{
	// 3) main function
		public static void main(String[] args) 
		{
			Student s[] = new Student[5];
			
			System.out.println("s : " + s);
			
			for(int i = 0 ; i < s.length ; i++) 
			{
				s[i] = new Student();	
				s[i].scanData();
			}
			for(int i = 0 ; i < s.length ; i++) 
			{
				s[i].dispData();
			}
			
//			s[0] = new Student();
//			s[0].scanData();
//			
//			s[1] = new Student();
//			s[1].scanData();
//			
//			
//			s[2] = new Student();
//			s[2].scanData();
//			
//			
//			s[3] = new Student();
//			s[3].scanData();
//			
//			s[4] = new Student();
//			s[4].scanData();
			
			
			System.out.println("s[0] : " + s[0]);
			System.out.println("s[1] : " + s[1]);
			System.out.println("s[2] : " + s[2]);
			System.out.println("s[3] : " + s[3]);
			System.out.println("s[4] : " + s[4]);

			
//			s[0].dispData();
//			s[1].dispData();
//			s[2].dispData();
//			s[3].dispData();
//			s[4].dispData();
			
//			s1.scanData();
//			s2.scanData();
//			s3.scanData();
//			s4.scanData();
//			s5.scanData();
//			
//			s1.dispData();
//			s2.dispData();
//			s3.dispData();
//			s4.dispData();
//			s5.dispData();
		}
}
