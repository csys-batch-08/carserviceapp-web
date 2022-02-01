package com.carserviceapp.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.carserviceapp.encrypt.EncryptPassword;
public class ConnectionUtil 
{
	  private ConnectionUtil() {
		super();
	}

	public static Connection getDBconnection() throws ClassNotFoundException, SQLException
	  {
		  Class.forName("oracle.jdbc.OracleDriver");
		  try {
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",EncryptPassword.decrypt());
		} catch (Exception e) {
			e.getCause();
		}
		return null;
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
			  e.getCause();
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
			e.getCause();  
		  }
	  }
	  
	  
}
