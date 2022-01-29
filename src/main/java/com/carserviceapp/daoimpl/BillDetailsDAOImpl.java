package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.connection.*;
import com.carserviceapp.dao.BillDetailsDAO;
import com.carserviceapp.model.*;
public class BillDetailsDAOImpl implements BillDetailsDAO
{		
	   public int insert(BillDetails bill) 
	   {
		   String insertQuery="insert into bill(user_id,serv_date,amount) values (?,?,(SELECT sum(service_cost) from services where service_id in (select service_id from service_details where user_id in ?)))";
		   Connection con = null;
		   int i = 0;
		   PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,bill.getUserId());
			stmt.setDate(2,java.sql.Date.valueOf(bill.getServDate()));
			stmt.setInt(3,bill.getAmount()); 
			i = stmt.executeUpdate();
		    }
		catch(SQLException | ClassNotFoundException e)
		{
			e.getCause();
		}
		finally
		{
			ConnectionUtil.closePreparedStatement(stmt,con);
		}
		return i;
	   }
	   
	   
	   public boolean update(BillDetails bill)
	   {
		  String updateQuery="update bill set amount=? where bill_num=?";
		  Connection con = null;
		  PreparedStatement stmt = null;
		  int k=0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQuery);
			stmt.setInt(1,bill.getAmount());
			stmt.setInt(2,bill.getBillNum());
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
	   
	   //user myorders option yes
	   public List<BillDetails> view(BillDetails billPojo) 
		{
			String showQuery="select bill_num,serv_date,amount,status from bill where user_id in ? and status like 'processing'";
			Connection con = null;
			ResultSet rs=null;
			 PreparedStatement stmt = null;
			List<BillDetails> orderslist=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
				stmt=con.prepareStatement(showQuery);
				stmt.setInt(1, billPojo.getUserId());
				rs=stmt.executeQuery();
				while(rs.next())
				{
					BillDetails customer = new BillDetails(rs.getInt(1),rs.getDate(2).toLocalDate(),rs.getInt(3),rs.getString(4));
					orderslist.add(customer);
				}
			}catch (SQLException | ClassNotFoundException e1) 
			{
				e1.getCause();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return orderslist;
		}
	   
	   
	   //user myorders option no
	   public List<BillDetails> pendingview(BillDetails billPojo) 
		{
			String showQuery="select bill_num,serv_date,amount,status from bill where user_id in ? and status like 'paid'";
			
			Connection con=null;
			ResultSet rs=null;
			PreparedStatement stmt=null;
			List<BillDetails> orderslist=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
				stmt=con.prepareStatement(showQuery);
				stmt.setInt(1, billPojo.getUserId());
				rs=stmt.executeQuery();
				while(rs.next())
				{
					BillDetails customer = new BillDetails(rs.getInt(1),rs.getDate(2).toLocalDate(),rs.getInt(3),rs.getString(4));
					orderslist.add(customer);
				}
			}catch (SQLException | ClassNotFoundException e1) 
			{
				e1.getCause();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return orderslist;
		}
	   
	   //after payment option
	   public int view1(BillDetails billpojo1) 
		{
			String showQuery="select amount from bill where user_id in ? and bill_num in ?";
			Connection con=null;
			ResultSet rs=null;
			PreparedStatement stmt=null;
			try {
				con = ConnectionUtil.getDBconnection();
		        stmt=con.prepareStatement(showQuery);
				stmt.setInt(1, billpojo1.getUserId());
				stmt.setInt(2, billpojo1.getBillNum());
				rs=stmt.executeQuery();
				while(rs.next()) {
					return rs.getInt(1);
				}
			}catch (SQLException | ClassNotFoundException e1) 
			{
				e1.getCause();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return 0;
		}
	   
	   
	   public boolean fetch(BillDetails checkamount) 
	   {	
			String query="select bill_num,user_id,serv_date,amount,status from bill where bill_num in ? and amount in ?";
			Connection con = null;
			PreparedStatement stmt = null;
			try {
				con = ConnectionUtil.getDBconnection();
			
				stmt = con.prepareStatement(query);
				stmt.setInt(1,checkamount.getBillNum());
				stmt.setInt(2,checkamount.getAmount());
			    ResultSet rs = null;
				rs = stmt.executeQuery();
				while(rs.next()) {			
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
	   
	   
	   //for payment to get bill num
	   public int fetchbillnum(BillDetails payment)
	   {
		    String query="select bill_num from bill where user_id  in ?";  
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			int i=0;
			try {
				con = ConnectionUtil.getDBconnection();
			    stmt = con.prepareStatement(query);
				stmt.setInt(1,payment.getUserId());
				 rs = stmt.executeQuery();
				 if(rs.next())
				 {
					 i=rs.getInt(1);
				 }
			} catch (SQLException | ClassNotFoundException e) 
			{
				e.getCause();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return i;
	   }   
	   
	   public  List<BillDetails> adminview() 
		{
			String showQuery="select bill_num,user_id,serv_date,amount,status from bill";
			Connection con=null;
			ResultSet rs=null;
			PreparedStatement stmt=null;
			List<BillDetails> billlist=new ArrayList<>();
			try {
				con = ConnectionUtil.getDBconnection();
				stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery();	
				while(rs.next())
				{
					BillDetails bills = new BillDetails(rs.getInt(1),rs.getInt(2),rs.getDate(3).toLocalDate(),rs.getInt(4),rs.getString(5));
					billlist.add(bills);
				}
			} catch (SQLException | ClassNotFoundException e1) 
			{
				e1.getCause();
			}
			finally
			{
				ConnectionUtil.closePreparedStatement(stmt,con);
			}
			return billlist;
		}
	   public boolean updatestatus(BillDetails bill)
	   {
		  String updateQuery="update bill set status='paid' where user_id=?";
		  Connection con = null;
		  PreparedStatement stmt = null;
		  int k=0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQuery);
			stmt.setInt(1,bill.getUserId());
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
