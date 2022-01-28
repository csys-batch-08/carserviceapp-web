		package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.connection.*;
import com.carserviceapp.dao.CenterDetailsDAO;
import com.carserviceapp.model.*;
public class CenterDetailsDAOImpl implements CenterDetailsDAO
{
	   public boolean insert(CenterDetails center)
	   {
		   String insertQuery="insert into service_center(user_id,center_name,c_location,c_contact,c_email,c_address) values(?,?,?,?,?,?)";
		   Connection con = null;
		   PreparedStatement stmt = null;
		   int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,center.getUserId());
			stmt.setString(2,center.getCenterName());
			stmt.setString(3,center.getCenterLocation());
			stmt.setLong(4,center.getCenterContact());
			stmt.setString(5,center.getCenterEmail());
			stmt.setString(6,center.getCenterAddress());
			i = stmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		 finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
		if(i>0)
		{
		return true;
		}
		return false;
	   }
	   public List<CenterDetails> showview() 
		{
			
			String showQuery="select center_id,center_name,c_location,c_contact,c_email,c_address from service_center where status='active'";
			Connection con=null;
			ResultSet rs=null;
			PreparedStatement stmt=null;
			List<CenterDetails> centerlist=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
				stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery(showQuery);	
				while(rs.next())
				{
					CenterDetails pickup = new CenterDetails(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6));
					centerlist.add(pickup);
				}
			}  catch (SQLException | ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			 finally
				{
					ConnectionUtil.closePreparedStatement(stmt,con);
				}
			return centerlist;
		}  
	   public List<CenterDetails> showsview() 
		{
			String showQuery="select center_id,center_name,c_location,c_contact,c_email,c_address from service_center where status='active'";
			ResultSet rs=null;
			 Connection con = null;
			   PreparedStatement stmt = null;
			List<CenterDetails> centerlist=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
				 stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery(showQuery);	
				while(rs.next())
				{
					CenterDetails customer = new CenterDetails(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6));
					centerlist.add(customer);
				}
			}  catch (SQLException | ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			 finally
				{
					ConnectionUtil.closePreparedStatement(stmt,con);
				}
			return centerlist;
		}  
	   
	   public int checkservicecenterid(CenterDetails center)
	   {
		 String query="select center_id,user_id,center_name,c_location,c_contact,c_email,c_address,status from service_center where center_id in ?";  
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			int centerid=0;
			try {
				con = ConnectionUtil.getDBconnection();
			    stmt = con.prepareStatement(query);
				stmt.setInt(1,center.getCenterId());
				 rs = stmt.executeQuery();
				 while(rs.next())
				 {
					 centerid=rs.getInt(1);
				 }
			} catch (SQLException | ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			 finally
				{
					ConnectionUtil.closePreparedStatement(stmt,con);
				}
			return centerid;
	   }
	   
	   
	   public boolean delete(CenterDetails center)
	   {
		  String deleteQuery="update service_center set status='inactive' where center_id=?";
		  Connection con = null;
		    PreparedStatement stmt = null;
		  int k = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setInt(1,center.getCenterId());
		
			k = stmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		 finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
		if(k>0)
		{
		return true;
	   }
		return false;
	   }
	   
	   
	   public boolean update(CenterDetails center) 
	   {
		   String deleteQuery="update service_center set c_contact=? where center_id=?";
		   Connection con = null;
		   PreparedStatement stmt = null;
		   int l = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setLong(1,center.getCenterContact());
			stmt.setInt(2,center.getCenterId());
			l = stmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		 finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
		if(l>0)
		{
		return true;
		}
		 return false;
	   }
}
