package callableStmts;

import java.sql.*;

public class Insert_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareCall("{call.Inset_proc_Cricket(?,?,?)}");
		stmt.setInt(1,3);
		stmt.setString(2,"Pakistan");
		stmt.setInt(3,15);
		stmt.executeUpdate();
		PreparedStatement stmt1=con.prepareCall("{call.Inset_proc_Cricket(?,?,?)}");
		stmt1.setInt(1,4);
		stmt1.setString(2,"New Zeland");
		stmt1.setInt(3,12);
		stmt1.executeUpdate();
		PreparedStatement stmt2=con.prepareCall("{call.Inset_proc_Cricket(?,?,?)}");
		stmt2.setInt(1,5);
		stmt2.setString(2,"Bangladesh");
		stmt2.setInt(3,11);
		stmt2.executeUpdate();
		ResultSet rs=stmt1.executeQuery("select * from cricketteam");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
        con.close();
	}

}
