package callableStmts;

import java.sql.*;

public class Update_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareCall("{call.Update_cricketteam (?,?,?)}");
		stmt.setInt(1,3);
		stmt.setString(2,"India");
		stmt.setInt(3,19);
		//stmt.setInt(3,3);
        stmt.executeUpdate();
        ResultSet rs=stmt.executeQuery("Select * from cricketteam");
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
	}

}
