package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.connection.*;
import com.carserviceapp.dao.CarPickUpDAO;
import com.carserviceapp.model.*;
public class CarPickUpDAOImpl implements CarPickUpDAO
	{
	   public int insert(CarPickUp pickup) 
	   {
		   String insertQuery="insert into pickup(user_id,cus_name,cus_email,cus_contact,pick_address,center_id) values(?,?,?,?,?,?)";
		   Connection con = null;
		   PreparedStatement stmt = null;
		   int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,pickup.getUserId());
			stmt.setString(2,pickup.getcName());
			stmt.setString(3,pickup.getcEmail());
			stmt.setLong(4,pickup.getcMobile());
			stmt.setString(5,pickup.getPickAddress());
			stmt.setInt(6,pickup.getCenterId());
		    i = 0;
			i = stmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.getCause();
		}
		finally
		{
			ConnectionUtil.closePreparedStatement(stmt,con);
		}
		return i;
	   }
	   
	   
	   public boolean update(CarPickUp pickup)
	   {
		   int k=0;
		   Connection con =null;
		   PreparedStatement stmt=null;
	 try {
		  String updateQuery="update pickup set pick_address=? where user_id=?";
		  con=ConnectionUtil.getDBconnection();
		  stmt = con.prepareStatement(updateQuery);
		  stmt.setString(1,pickup.getPickAddress());
		  stmt.setInt(2,pickup.getUserId());
		  k =stmt.executeUpdate();
		  if(k>0)
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
	   
	   
	   public boolean delete(CarPickUp pickup)
	   {
		   int l=0;
		   PreparedStatement stmt = null ;
		   Connection con = null;
		   try {
		   String deleteQuery="delete from pickup where pickup_id=?";
		   con =ConnectionUtil.getDBconnection();
		   stmt=con.prepareStatement(deleteQuery);
		   stmt.setInt(1,pickup.getPickupId());
		   l = stmt.executeUpdate();
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
	   
	   
	   public List<CarPickUp> pickupview() 
		{	
			String showQuery="select pickup_id,user_id,cus_name,cus_email,cus_contact,pick_address,center_id,status from pickup order by pickup_id desc";
			ResultSet rs=null;
			Connection con = null;
			PreparedStatement stmt = null;
			List<CarPickUp> pickuplist = new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
                stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery();
				while(rs.next())
				{
					CarPickUp pickup = new CarPickUp(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getInt(7),rs.getString(8));
					pickuplist.add(pickup);
				}
			}  catch (SQLException | ClassNotFoundException e1) 
			{
				e1.getCause();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return pickuplist;
		}
	   public List<CarPickUp> admincenterview(CarPickUp admincenter) 
		{
		   ResultSet rs=null;
			String showQuery="select pickup_id,user_id,cus_name,cus_email,cus_contact,pick_address,center_id,status from pickup where center_id in ?";
			Connection con = null;
			PreparedStatement stmt = null;
			List<CarPickUp> centerlist=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
				stmt=con.prepareStatement(showQuery);
				stmt.setInt(1,admincenter.getCenterId());
				rs=stmt.executeQuery();	
				while(rs.next())
				{
					CarPickUp pickup = new CarPickUp(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getInt(7));
					centerlist.add(pickup);
				}
			} 
			catch (SQLException | ClassNotFoundException e1) 
			{
				e1.getCause();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return centerlist;
		}
	   
	   public boolean updatepickupstatus(CarPickUp pick)
	   {
		  String updateQuery="update pickup set status='serviced' where user_id=?";
		  Connection con = null;
		  PreparedStatement stmt = null;
		  int k=0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQuery);
			stmt.setInt(1,pick.getUserId());
			k =stmt.executeUpdate();
			if(k>0)
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
