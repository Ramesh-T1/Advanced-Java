package mysql;

import java.sql.*;

public class DeleteStmt_Ex2 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from teamIndia where PlayerName='Rohit sharma'");
		ResultSet rs=stmt.executeQuery("select * from teamIndia");
		System.out.println("TeamName  PlayerName  Age  Matchers");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		con.close();
	}
}
