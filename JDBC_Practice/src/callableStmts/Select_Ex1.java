package callableStmts;

import java.sql.*;

public class Select_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareCall("{call.Select_from_Cricket(?)}");
		stmt.setString(1,"Pakistan");
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		con.close();
	}
}
