package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.carserviceapp.connection.*;
import com.carserviceapp.dao.ServiceDetailsDAO;
import com.carserviceapp.model.*;

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
		} catch (SQLException | ClassNotFoundException e) 
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
		   PreparedStatement stmt = null;
		   try {
		   String deleteQuery="delete from service_details where service_id=?";
		   con =ConnectionUtil.getDBconnection();
		   stmt =con.prepareStatement(deleteQuery);
		   stmt.setInt(1,service.getServiceId());
		    l= stmt.executeUpdate();
		    if(l>0)
			{
				return true;
			}
	   } catch (SQLException | ClassNotFoundException e) 
		   {
			e.getCause();
		   }
		   finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
	    return false;
	   }
}
