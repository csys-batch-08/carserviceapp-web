		package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		   int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
		   PreparedStatement stmt = null;
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,center.getUser_id());
			stmt.setString(2,center.getCenter_name());
			stmt.setString(3,center.getCenter_location());
			stmt.setLong(4,center.getCenter_contact());
			stmt.setString(5,center.getCenter_email());
			stmt.setString(6,center.getCenter_address());
			i = stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			Connection con;
			ResultSet rs=null;
			List<CenterDetails> centerlist=new ArrayList<CenterDetails>();
			try {
				con = ConnectionUtil.getDBconnection();
				PreparedStatement stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery(showQuery);	
				while(rs.next())
				{
					CenterDetails pickup = new CenterDetails(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6));
					centerlist.add(pickup);
				}
			}  catch (SQLException | ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			return centerlist;
		}  
	   
	   public List<CenterDetails> showsview() 
		{
			
			String showQuery="select center_id,center_name,c_location,c_contact,c_email,c_address from service_center where status='active'";
			Connection con;
			ResultSet rs=null;
			List<CenterDetails> centerlist=new ArrayList<CenterDetails>();
			try {
				con = ConnectionUtil.getDBconnection();
				PreparedStatement stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery(showQuery);	
				while(rs.next())
				{
					CenterDetails customer = new CenterDetails(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6));
					centerlist.add(customer);
				}
			}  catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return centerlist;
		}  
	   
	   public ResultSet checkservicecenterid(CenterDetails center)
	   {
		 String query="select * from service_center where center_id in ?";  
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ConnectionUtil.getDBconnection();
			    pstmt = con.prepareStatement(query);
				pstmt.setInt(1,center.getCenter_id());
				 rs = pstmt.executeQuery();
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
	   }
	   
	   
	   public boolean delete(CenterDetails center)
	   {
		  String deleteQuery="update service_center set status='inactive' where center_id=?";
		  Connection con = null;
		  int k = 0;
		try {
			con = ConnectionUtil.getDBconnection();
	      PreparedStatement stmt = null;
			stmt = con.prepareStatement(deleteQuery);
			stmt.setInt(1,center.getCenter_id());
		
			k = stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		   int l = 0;
		try {
			con = ConnectionUtil.getDBconnection();
		   PreparedStatement stmt = null;
			stmt = con.prepareStatement(deleteQuery);
			stmt.setLong(1,center.getCenter_contact());
			stmt.setInt(2,center.getCenter_id());
			l = stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(l>0)
		{
		return true;
		}
		 return false;
	   }
}
