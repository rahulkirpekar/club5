package striingtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		//             01234
		String stmt = "madam";

		boolean flag = true; 
		
		for (int i = 0 , j = (stmt.length()-1); i < stmt.length(); i++,j--) 
		{
			System.out.println(i+"---"+stmt.charAt(i)+"------------"+stmt.charAt(j)+"---"+j);
			
			if (stmt.charAt(i) != stmt.charAt(j)) 
			{
				flag = false;
				break;
			} 
		}
		if (flag)
		{
			System.out.println(stmt+" is Palindrome");
		} else 
		{
			System.out.println(stmt+" is not Palindrome");
		}
		 
//		System.out.println(stmt.charAt(0));
//		System.out.println(stmt.charAt(1));
//		System.out.println(stmt.charAt(2));
//		System.out.println(stmt.charAt(3));
//		System.out.println(stmt.charAt(4));
//		System.out.println("stmt.length() : "  + stmt.length());
		
	}
}
