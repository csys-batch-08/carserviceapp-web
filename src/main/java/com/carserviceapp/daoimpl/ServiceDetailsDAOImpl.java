package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.carserviceapp.dao.ServiceDetailsDAO;
import com.carserviceapp.model.*;
import com.carserviceapp.util.*;
public class ServiceDetailsDAOImpl implements ServiceDetailsDAO
{
	 public boolean insert(ServiceDetails details)

	   {
		   String insertQuery="insert into service_details(user_id,service_id) values(?,?)";
		   Connection con = null;
		   PreparedStatement stmt = null;
		   int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,details.getUserId());
			stmt.setInt(2,details.getServiceId());
			i = stmt.executeUpdate();
			if(i>0)
			{
				return true;
			}
		} catch (Exception e) 
		{
			e.getCause();
		}
		 finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
		return false;
	   }

	 public boolean delete(ServiceDetails service)
	   {
		 int l =0;
		 Connection con = null;
		   PreparedStatement stmts= null;
		   try {
		   String deleteQuery="delete from service_details where service_id=?";
		   con =ConnectionUtil.getDBconnection();
		   stmts =con.prepareStatement(deleteQuery);
		   stmts.setInt(1,service.getServiceId());
		    l= stmts.executeUpdate();
		    if(l>0)
			{
				return true;
			}
	   } catch (Exception e) 
		   {
			e.getCause();
		   }
		   finally
			{
				ConnectionUtil.closePreparedStatement(stmts,con);
			}
	    return false;
	   }
}
