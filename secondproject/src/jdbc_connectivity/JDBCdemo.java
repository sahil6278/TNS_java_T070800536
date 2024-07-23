package jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
public class JDBCdemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","1234");
		System.out.println("Connection Established : ");
		
		PreparedStatement stmt=con.prepareStatement("insert into student(roll, name, marks) values(?,?,?)");
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter roll number : ");
//		int roll=s.nextInt();
//		System.out.println("Enter name : ");
//		String name=s.next();
//		System.out.println("Enter marks : ");
//		int marks=s.nextInt();
//		
//		stmt.setInt(1, roll);
//		stmt.setString(2, name);
//		stmt.setInt(3, marks);
//		
//		int i=stmt.executeUpdate();
//		
//		if(i==1)
//		{
//			System.out.println("Record Successfully Inserted !!");
//		}
		
		System.out.println("ResultSet----->");
		stmt.executeUpdate("delete from student where roll=9");
		
		ResultSet rs=stmt.executeQuery("select * from student");
		
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
	}
}
