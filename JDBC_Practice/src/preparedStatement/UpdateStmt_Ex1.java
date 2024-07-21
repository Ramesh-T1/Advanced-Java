package preparedStatement;

import java.sql.*;

public class UpdateStmt_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareStatement("Update teamaustralia set Playername=? where Playername=?");
		stmt.setString(1,"Glenn McGrath");
		stmt.setString(2,"McGrath");
		stmt.executeUpdate();
		PreparedStatement stmt1=con.prepareStatement("Select * from teamaustralia");
		ResultSet rs=stmt1.executeQuery();
		System.out.println("TeamName  PlayerName  Age");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
        con.close();
	}
}
