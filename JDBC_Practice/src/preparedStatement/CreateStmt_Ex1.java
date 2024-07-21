package preparedStatement;

import java.sql.*;

import javax.sql.RowSet;

public class CreateStmt_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root@123");
		PreparedStatement stmt=con.prepareStatement("create table teamAustralia (TeamName varchar(50),PlayerName varchar(50),Age int)");
		stmt.executeUpdate();
		stmt.close();
		con.close();
	}
}
