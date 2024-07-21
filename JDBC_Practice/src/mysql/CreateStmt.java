package mysql;

import java.sql.*;

public class CreateStmt 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("create table CricketTeam (Position int,TeamName varchar(50),Points int)");
		ResultSet rs=stmt.executeQuery("show tables");
		while(rs.next())
		{
			if(rs.getString(1).equalsIgnoreCase("CricketTeam"))
			{
				System.out.println("Table"+rs.getString(1)+"Created Sucessfully");
			}
		}
		con.close();
	}
}
