package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.carserviceapp.connection.*;
import com.carserviceapp.dao.CarServicesDAO;
import com.carserviceapp.model.*;
public class CarServicesDAOImpl implements CarServicesDAO
{
	   public boolean insert(CarServices service)
	   {
		   String insertQuery="insert into services(service_name,service_cost,service_desc) values(?,?,?)";
		   Connection con = null;
		   int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
		   PreparedStatement stmt = null;
			stmt = con.prepareStatement(insertQuery);
			stmt.setString(1,service.getService_name());
			stmt.setInt(2,service.getService_cost());
			stmt.setString(3,service.getService_desc());
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
	   public boolean update(CarServices service) 
	   {
		  String updateQuery="update services set service_cost=? where service_id=?";
		  Connection con = null;
		  int k = 0;
		try {
			con = ConnectionUtil.getDBconnection();
		  PreparedStatement stmt = null;
			stmt = con.prepareStatement(updateQuery);
			stmt.setInt(1,service.getService_cost());
			stmt.setInt(2,service.getService_id());		 
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
	   
	   
	   public boolean delete(CarServices service)
	   {
		   int l = 0;
		   try {
		   String deleteQuery="update services set status='inactive' where service_id=?";
		   Connection con =ConnectionUtil.getDBconnection();
		   PreparedStatement stmt =con.prepareStatement(deleteQuery);
		   stmt.setInt(1,service.getService_id());
		   l = stmt.executeUpdate();
		   stmt.close();
		   con.close();
	   } catch (SQLException | ClassNotFoundException e)
		   {
			e.printStackTrace();
		   }
	if(l > 0) 
	{
	     return true;
	}
		return false;
	   }
	   
	   
	   public ResultSet checkserviceid(CarServices services)
	   {
		 String query="select * from services where service_id in ?";  
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ConnectionUtil.getDBconnection();
			    pstmt = con.prepareStatement(query);
				pstmt.setInt(1,services.getService_id());
				 rs = pstmt.executeQuery();
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
	   }
	   
	   public List<CarServices> view() 
		{
			ResultSet rs=null;
			String showQuery="select service_name,service_cost,service_desc,service_id from services where status='active'";
			Connection con;
			List<CarServices> servicelist=new ArrayList<CarServices>();
			try {
				con = ConnectionUtil.getDBconnection();
				PreparedStatement stmt=con.prepareStatement(showQuery);
				rs=stmt.executeQuery(showQuery);
				while(rs.next())
				{
					CarServices pickup = new CarServices(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4));
					servicelist.add(pickup);
				}
			}  catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return servicelist;
		}
	   public List<CarServices> views() 
	 		{
	 			ResultSet rs=null;
	 			String showQuery="select service_name,service_cost,service_desc,service_id from services where status='active'";
	 			Connection con;
	 			List<CarServices> servicelist=new ArrayList<CarServices>();
	 			try {
	 				con = ConnectionUtil.getDBconnection();
	 				PreparedStatement stmt=con.prepareStatement(showQuery);
	 				rs=stmt.executeQuery(showQuery);
	 				while(rs.next())
					{
						CarServices services = new CarServices(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4));
						servicelist.add(services);
					}
	 			}  catch (SQLException | ClassNotFoundException e1) {
	 				// TODO Auto-generated catch block
	 				e1.printStackTrace();
	 			}
	 			return servicelist;
	 		}
	}
