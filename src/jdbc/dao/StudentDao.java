package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

// StudentDao----SQL queries===>Student Table 

public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		int rowAffected = 0;
		Statement stmt = null;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+sbean.getName()+"','"+sbean.getStd()+"','"+sbean.getMarks()+"')";

		// 1) get Db connection object
		Connection conn = DBConnection.getConnection();
		
		// 2) validate conn object
		if (conn!=null) 
		{
			try 
			{
				// 3) create statement object
				stmt = conn.createStatement();
				
				// 4) execute insert query
				rowAffected = stmt.executeUpdate(insertQuery);	
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao :: insertStudent()  Db not connected");
		} 
		return rowAffected;
	}
	public  int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+sbean.getName()+"',std="+sbean.getStd()+",marks="+sbean.getMarks()+" WHERE rno="+rno;
		Connection conn = DBConnection.getConnection();
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				Statement stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao----updateStudent()--Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = "+rno;
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(deleteQuery);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---deleteStudent()----Db not Connected");
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllRecords() 
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		String selectQuery = "SELECT rno,name,std,marks FROM student";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		StudentBean sbean = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					String std = rs.getString(3);
					String marks = rs.getString(4);
					
//					System.out.println(rno+" "+ name+" " + std+" " + marks);
					
					sbean = new StudentBean(rno, name, std, marks);
					
					list.add(sbean);
				}
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao :: getAllRecords()  Db not connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		StudentDao dao = new StudentDao();

		ArrayList<StudentBean> list = dao.getAllRecords();
		
		System.out.println("list.size() : " + list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
/*		
//-------------UPDATE Student------------------------		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno which you want to update record : ");
		int rno = sc.nextInt();		
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		String marks = sc.nextLine();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowAffected = dao.updateStudent(sbean,rno);
		
		if (rowAffected > 0)
		{
			System.out.println("Student record successfully Updated : " + rowAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowAffected);
		}
//-------------DELETE Student------------------------		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno which you want to delete record : ");
		int rno = sc.nextInt();		

		StudentDao dao = new StudentDao();

		int rowAffected = dao.deleteStudent(rno);
		
		if (rowAffected > 0)
		{
			System.out.println("Student record successfully Deleted : " + rowAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowAffected);
		}
//-------------INSERT Student------------------------		
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowAffected = dao.insertStudent(sbean);
		
		if (rowAffected > 0)
		{
			System.out.println("Student record successfully Inserted : " + rowAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowAffected);
		}
*/		
	}
}