package mysql;

import java.sql.*;

public class CreateStmtEx1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("create table teamIndia (TeamName varchar(50),PlayerName varchar(50),Age int,Matches int)");
		ResultSet rs=stmt.executeQuery("Show tables");
		while(rs.next())
		{
			if(rs.getString(1).equalsIgnoreCase("TeamIndia"))
			{
				System.out.println("Table "+rs.getString(1)+" created sucessfully");
			}
		}
	}
}
