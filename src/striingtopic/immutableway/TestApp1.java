package striingtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "Royal";
		String name2 = "Royal";
		String name3 = "Techno";

		String fullName = name1 + name3;

		System.out.println("name1==name2 : " +  (name1==name2));//true
		System.out.println("name1==name3 : " +  (name1==name3));//false
		System.out.println("name1==fullName : " +  (name1==fullName));//false
		
//----------------------------------------------------------------------------------
		
		String name4 = new String("Royal");
		String name5 = new String("Royal");
		
		System.out.println("name4==name5 " + (name4==name5));//false
	
	}
}
