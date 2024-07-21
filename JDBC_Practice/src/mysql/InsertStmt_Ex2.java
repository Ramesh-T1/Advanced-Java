package mysql;

import java.sql.*;

public class InsertStmt_Ex2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("Insert into teamIndia values ('India','Rohit Sharma',35,300),('India','Virat Kohli',35,300)");
		ResultSet rs=stmt.executeQuery("select * from teamIndia");
		System.out.println("Team Name      PlayerName     Age      Matches");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
        con.close();
	}

}
