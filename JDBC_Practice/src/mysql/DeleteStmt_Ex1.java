package mysql;

import java.sql.*;

public class DeleteStmt_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from cricketteam where position=3");
		ResultSet rs=stmt.executeQuery("select * from cricketteam");
		System.out.println("Position  TeamName  Points");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
	}
}
