package com.carserviceapp.util;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.carserviceapp.encrypt.EncryptPassword;
public class ConnectionUtil 
{
	private ConnectionUtil()
	{
		super();
	}
	public static Connection getDBconnection() throws ClassNotFoundException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, SQLException
	  {
		  Class.forName("oracle.jdbc.OracleDriver");
		  return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",EncryptPassword.decrypt());
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
