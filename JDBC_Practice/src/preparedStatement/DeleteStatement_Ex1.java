package preparedStatement;

import java.sql.*;

public class DeleteStatement_Ex1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareStatement("Delete from teamaustralia where playername=?");
		stmt.setString(1,"David Warner");
		stmt.executeUpdate();
		PreparedStatement stmt1=con.prepareStatement("select * from teamaustralia");
		System.out.println("TeamName  PlayerName  Age");
		ResultSet rs=stmt1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		con.close();
	}
}
