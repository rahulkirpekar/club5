package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	// 1) MySQL Credentials
	private static final String URLNAME = "jdbc:mysql://localhost:3306/club5";
	private static final String DRIVERCLASS= "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	// 2) create getConnection method
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3) load Driver class
			Class.forName(DRIVERCLASS);	
			
			// 4) pass credentials into DriverManager's getconnction method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) 
	{
		Connection conn = DBConnection.getConnection();
		
		// 5) validate conn object
		if (conn!=null) 
		{
			System.out.println("Db connected : " + conn);
			
		} else 
		{
			System.out.println("Db not connected : " + conn);
		}
	}
}