package preparedStatement;

import java.sql.*;

public class InsertStmt_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareStatement("Insert into teamaustralia values (?,?,?),(?,?,?),(?,?,?),(?,?,?)");
		stmt.setString(1,"Australia");
		stmt.setString(2,"Steve Smith");
		stmt.setInt(3,30);
		stmt.setString(4,"Australia");
		stmt.setString(5,"Brett Lee");
		stmt.setInt(6,40);
		stmt.setString(7,"Australia");
		stmt.setString(8,"McGrath");
		stmt.setInt(9,40);	
		stmt.setString(10,"Australia");
		stmt.setString(11,"David warner");
		stmt.setInt(12,34);
		stmt.executeUpdate();
		PreparedStatement stmt1=con.prepareStatement("select * from teamaustralia");
		ResultSet rs=stmt1.executeQuery();
		System.out.println("TeamName   PlayerName   Age");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
}
