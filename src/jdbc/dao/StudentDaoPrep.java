package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowsAffected = 0;
		
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
				
				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setString(3, sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep :: insertStudent() Db not connected");
		}
		return rowsAffected;
	}

	
	public  int updateStudent(StudentBean sbean , int rno) 
	{
		PreparedStatement pstmt = null;
		String updateQuery = "UPDATE student SET name=?,std=?,marks=? WHERE rno=?";
		Connection conn = DBConnection.getConnection();
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setString(3, sbean.getMarks());
				pstmt.setInt(4, rno);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep----updateStudent()--Db not connected");
		}
		return rowsAffected;
	}
	
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = ?";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
				
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---deleteStudent()----Db not Connected");
		}
		return rowsAffected;
	}
	
	
	public ArrayList<StudentBean> getAllRecords() 
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		String selectQuery = "SELECT rno,name,std,marks FROM student";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		StudentBean sbean = null;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				rs = pstmt.executeQuery();
				
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
			System.out.println("StudentDaoPrep :: getAllRecords()  Db not connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
// ---------------------SELECT  Query----------------------------------------------------		
		
		StudentDaoPrep dao = new StudentDaoPrep();

		ArrayList<StudentBean> list = dao.getAllRecords();
		
		System.out.println("list.size() : " + list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
// ---------------------DELETE Query----------------------------------------------------	
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno which you want to delete record : ");
		int rno = sc.nextInt();		

		StudentDaoPrep dao = new StudentDaoPrep();

		int rowAffected = dao.deleteStudent(rno);
		
		if (rowAffected > 0)
		{
			System.out.println("Student record successfully Deleted : " + rowAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowAffected);
		}
		
		
// ---------------------UPDATE Query----------------------------------------------------			
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
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowAffected = dao.updateStudent(sbean,rno);
		
		if (rowAffected > 0)
		{
			System.out.println("Student record successfully Updated : " + rowAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowAffected);
		}
		
// ---------------------INSERT Query----------------------------------------------------		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		String marks = sc.nextLine();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
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
