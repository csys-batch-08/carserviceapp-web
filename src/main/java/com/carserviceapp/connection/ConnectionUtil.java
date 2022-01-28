package com.carserviceapp.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConnectionUtil 
{
	  public static Connection getDBconnection() throws ClassNotFoundException, SQLException
	  {
		  Class.forName("oracle.jdbc.OracleDriver");
		  
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		  
		  return con;
	  }

	  public static void closePreparedStatement(PreparedStatement stmt,Connection con)
	  {
		  try
		  {
		  if(stmt!=null)
			{
				stmt.close();
			}
			if(con!=null)
			{
				con.close();
			}  
		  }catch(SQLException e)
		  {
			e.printStackTrace();  
		  }
	  }
	  
	  public static void closePreparedStatementOne(PreparedStatement pstmt)
	  {
		  try
		  {
		  if(pstmt!=null)
			{
				pstmt.close();
			}
		  }catch(SQLException e)
		  {
			e.printStackTrace();  
		  }
	  }
	  
	  
}
