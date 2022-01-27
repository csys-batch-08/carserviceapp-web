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
		   //String insertQuery="insert into bill(pickup_id,user_id,service_id,detail_id,serv_date,amount) values(?,?,?,?,?,?)";
		   String insertQuery="insert into bill(user_id,serv_date,amount) values (?,?,(SELECT sum(service_cost) from services where service_id in (select service_id from service_details where user_id in ?)))";
		   Connection con = null;
		   int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
		   PreparedStatement stmt = null;
		
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,bill.getUser_id());
			stmt.setDate(2,java.sql.Date.valueOf(bill.getServ_date()));
			stmt.setInt(3,bill.getAmount()); 
			i = stmt.executeUpdate();
			stmt.close();
			con.close();
		    }
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
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
			stmt.setInt(2,bill.getBill_num());
			k =stmt.executeUpdate();
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
//	   public boolean delete(billDetails c3)
//	   {
//		   try {
//		   String deleteQuery="delete from bill where bill_num=?";
//		   Connection con =carConnection.getDBconnection();
//		   PreparedStatement stmt =con.prepareStatement(deleteQuery);
//		   stmt.setInt(1,c3.getBill_num());
//		   int l = stmt.executeUpdate();
//		   //System.out.println(l+" row is deleted");
//		   stmt.close();
//		   con.close();
//		   }catch(SQLException | ClassNotFoundException e)
//		   {
//				e.printStackTrace();
//		   }
//		return true;
//	   }
	   
	   //user myorders option yes
	   public List<BillDetails> view(BillDetails billPojo) 
		{
			String showQuery="select bill_num,serv_date,amount,status from bill where user_id in ? and status like 'processing'";
			Connection con;
			ResultSet rs=null;
			List<BillDetails> orderslist=new ArrayList<BillDetails>();
			try {
				con = ConnectionUtil.getDBconnection();
				PreparedStatement pstmt=con.prepareStatement(showQuery);
				pstmt.setInt(1, billPojo.getUser_id());
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					BillDetails customer = new BillDetails(rs.getInt(1),rs.getDate(2).toLocalDate(),rs.getInt(3),rs.getString(4));
					orderslist.add(customer);
				}
			}catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return orderslist;
		}
	   //user myorders option no
	   public List<BillDetails> pendingview(BillDetails billPojo) 
		{
			String showQuery="select bill_num,serv_date,amount,status from bill where user_id in ? and status like 'paid'";
			
			Connection con;
			ResultSet rs=null;
			List<BillDetails> orderslist=new ArrayList<BillDetails>();
			try {
				con = ConnectionUtil.getDBconnection();
				PreparedStatement pstmt=con.prepareStatement(showQuery);
				pstmt.setInt(1, billPojo.getUser_id());
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					BillDetails customer = new BillDetails(rs.getInt(1),rs.getDate(2).toLocalDate(),rs.getInt(3),rs.getString(4));
					orderslist.add(customer);
				}
			}catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return orderslist;
		}
	   
	   //after payment option
	   public int view1(BillDetails billpojo1) 
		{
			String showQuery="select amount from bill where user_id in ? and bill_num in ?";
			Connection con;
			ResultSet rs=null;
			try {
				con = ConnectionUtil.getDBconnection();
				PreparedStatement pstmt=con.prepareStatement(showQuery);
				pstmt.setInt(1, billpojo1.getUser_id());
				pstmt.setInt(2, billpojo1.getBill_num());
				rs=pstmt.executeQuery();
				while(rs.next()) {
					System.out.println("hi suriya");
					return rs.getInt(1);
				}
			}catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return 0;
		}
	   
	   
	   public boolean fetch(BillDetails checkamount) 
	   {	
			String query="select * from bill where bill_num in ? and amount in ?";
			Connection con = null;
			try {
				con = ConnectionUtil.getDBconnection();
			PreparedStatement pstmt = null;
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1,checkamount.getBill_num());
				pstmt.setInt(2,checkamount.getAmount());
			    ResultSet rs = null;
				rs = pstmt.executeQuery();
				while(rs.next()) {			
				return true;
				}
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;	
		}
	   
	   
	   //for payment to get bill num
	   public int fetchbillnum(BillDetails payment) throws SQLException
	   {
		    String query="select bill_num from bill where user_id  in ?";  
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int i=0;
			System.out.println(payment.getUser_id());
			try {
				con = ConnectionUtil.getDBconnection();
			    pstmt = con.prepareStatement(query);
			   
				pstmt.setInt(1,payment.getUser_id());
				 rs = pstmt.executeQuery();
				 if(rs.next())
				 {
					 i=rs.getInt(1);
				 }
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return i;
	   }   
	   
	   public  List<BillDetails> adminview() 
		{
			String showQuery="select bill_num,user_id,serv_date,amount,status from bill";
			Connection con;
			ResultSet rs=null;
			List<BillDetails> billlist=new ArrayList<BillDetails>();
			try {
				con = ConnectionUtil.getDBconnection();
				PreparedStatement pstmt=con.prepareStatement(showQuery);
				rs=pstmt.executeQuery();	
				while(rs.next())
				{
					BillDetails bills = new BillDetails(rs.getInt(1),rs.getInt(2),rs.getDate(3).toLocalDate(),rs.getInt(4),rs.getString(5));
					billlist.add(bills);
				}
			} catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
			stmt.setInt(1,bill.getUser_id());
			k =stmt.executeUpdate();
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
}
