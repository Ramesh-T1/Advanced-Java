package preparedStatement;

import java.sql.*;

public class SelectEx1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareStatement("select * from teamaustralia where playername=?");
		stmt.setString(1,"Brett Lee");
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
        con.close();
	}
}
