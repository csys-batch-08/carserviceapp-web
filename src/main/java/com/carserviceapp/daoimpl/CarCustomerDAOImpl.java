package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.connection.*;
import com.carserviceapp.dao.CarCustomerDAO;
import com.carserviceapp.model.*;

public class CarCustomerDAOImpl implements CarCustomerDAO
	{
	   public boolean insert(CarCustomer user) 
	   {
		   String insertQuery="insert into userdetails(u_name,mobileno,u_password,u_email,u_address) values(?,?,?,?,?)";
		   Connection con = null;
		   PreparedStatement stmt = null;
		   int i = 0;
		   try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setString(1,user.getName());
			stmt.setLong(2,user.getMobileNo());
			stmt.setString(3,user.getPassword());
			stmt.setString(4,user.getEmail());
			stmt.setString(5,user.getAddress());
			i = stmt.executeUpdate();
			if(i>0)
			   {
					return true;
			   }
		} catch (SQLException | ClassNotFoundException e) 
		   {
			e.printStackTrace();
		    }
		   finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
       return false;
	   }
	   
	   public String fetch(CarCustomer userpasscheck) 
	   {	
			String query="select u_name,u_password from userdetails where u_name in ? and u_password in ?";
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			PreparedStatement pstmt =null;
			try {
				con = ConnectionUtil.getDBconnection();
				stmt = con.prepareStatement(query);
				stmt.setString(1, userpasscheck.getName());
				stmt.setString(2, userpasscheck.getPassword());
				rs = stmt.executeQuery();
				if(rs.next()) {
					String query1="select usertype from userdetails where u_name in ?";
					pstmt = con.prepareStatement(query1);
					pstmt.setString(1, userpasscheck.getName());
					ResultSet rs1 = pstmt.executeQuery();
					rs1.next();
					return rs1.getString(1);
				}
			} catch (SQLException | ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			 finally
				{
					ConnectionUtil.closePreparedStatement(stmt,con);
					ConnectionUtil.closePreparedStatementOne(pstmt);
				}
			return "incorrect";	
		}
	   
	   //my account option in user profile
	   public List<CarCustomer> view(CarCustomer myaccount)
	   {
		 String query="select user_id,u_name,mobileno,u_password,u_email,u_address from userdetails where u_name in ?";  
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			List<CarCustomer> custdetails=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
			    stmt = con.prepareStatement(query);
				stmt.setString(1, myaccount.getName());
				rs = stmt.executeQuery();
				while(rs.next())
					{
						CarCustomer customer = new CarCustomer(rs.getInt(1),rs.getString(2),rs.getLong(3),rs.getString(4),rs.getString(5),rs.getString(6));
						custdetails.add(customer);
					}
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			 finally
				{
					ConnectionUtil.closePreparedStatement(stmt,con);
				}
			return custdetails;
	   }
	   
	   //email check
	   public String getEmail(CarCustomer email)
	   {
		   String query="select user_id,u_name,mobileno,u_password,u_email,u_address,usertype from userdetails where u_email in ?";  
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			String useremail=null;
			try {
				con = ConnectionUtil.getDBconnection();
			    stmt = con.prepareStatement(query);
				stmt.setString(1, email.getEmail());
				 rs = stmt.executeQuery();
				 while(rs.next())
				 {
				 useremail=rs.getString(5);
				 }
			} catch (SQLException | ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			 finally
				{
					ConnectionUtil.closePreparedStatement(stmt,con);
				}
			return useremail;
	   }
	   
	   //mobile no check
	   public Long getMobile(CarCustomer mobile)
	   {
		   String query="select user_id,u_name,mobileno,u_password,u_email,u_address,usertype from userdetails where mobileno in ?";  
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			long usermobile=0;
			try {
				con = ConnectionUtil.getDBconnection();
			    stmt = con.prepareStatement(query);
				stmt.setLong(1, mobile.getMobileNo());
				 rs = stmt.executeQuery();
				 while(rs.next())
				 {
				 usermobile=rs.getLong(3);
				 }
			} catch (SQLException | ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return usermobile;
	   }
	   
	   
	   
	   public int fetchid(CarCustomer myaccount)
	   {
		    String query="select user_id from userdetails where u_name in ?";  
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			 int userid=0;			
			try {
				con = ConnectionUtil.getDBconnection();
			    stmt = con.prepareStatement(query);
				stmt.setString(1, myaccount.getName());
				 rs = stmt.executeQuery();
				 while(rs.next())
				 {
				 userid=rs.getInt(1);
				 }
			} catch (SQLException | ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return userid;
	   }   
	   
	   
	   public boolean update(CarCustomer user)
	   {
		  String updateQuery="update userdetails set u_password=? where user_id=?";
		  Connection con = null;
		  int k = 0;
		  PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQuery);
			stmt.setString(1,user.getPassword());
			stmt.setInt(2,user.getUserId());	
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
	   
	   //forgot password
	   public boolean forgotpassword(CarCustomer user)
	   {
		  String updateQuery="update userdetails set u_password=? where mobileno=?";
		  Connection con = null;
		  int k = 0;
		  PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();
     	  
			stmt = con.prepareStatement(updateQuery);
			stmt.setString(1,user.getPassword());
			stmt.setLong(2,user.getMobileNo()); 
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
	   
	   
	   //update usertype as invalid
	   public boolean delete(CarCustomer user)
	   {
		   String deleteQuery="update userdetails set usertype='invalid' where mobileno=?";
		   Connection con = null;
		   PreparedStatement stmt = null;
		   int l = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setLong(1,user.getMobileNo());
			l = stmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
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
	   //user account reactivate
	   public int reactivate(CarCustomer user)
	   {
		   String deleteQuery="update userdetails set usertype='user' where u_name=? and u_password=?";
		   Connection con = null;
		   PreparedStatement stmt = null;
		   int l = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setString(1,user.getName());
			stmt.setString(2,user.getPassword());
			l = stmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			ConnectionUtil.closePreparedStatement(stmt,con);
		}
		return l;
	   }
	   
	   
	   
	   public List<CarCustomer> view()
	   {
		   ResultSet rs=null;
			String showQuery="select u_name,mobileno,u_email,u_address,user_id from userdetails where usertype='user' or usertype='invalid'";
			Connection con = null;
			PreparedStatement stmt=null;
			List<CarCustomer> custlist=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
                stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery(showQuery);
				while(rs.next())
				{
					CarCustomer customer = new CarCustomer(rs.getString(1),rs.getLong(2),rs.getString(3),rs.getString(4),rs.getInt(5));
					custlist.add(customer);
				}
				
			}  catch (SQLException | ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return custlist;
	   }
	}
