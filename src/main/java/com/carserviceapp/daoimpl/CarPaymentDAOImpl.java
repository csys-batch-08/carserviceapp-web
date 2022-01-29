package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.carserviceapp.connection.*;
import com.carserviceapp.dao.CarPaymentDAO;
import com.carserviceapp.model.*;
public class CarPaymentDAOImpl implements CarPaymentDAO
{
	   public int insert(CarPayment payment) 
	   {
		   String insertQuery="insert into payment(bill_num,card_no,cardhol_name,expiry_date,cvv_no,amt_paid) values(?,?,?,?,?,?)";
		   Connection con = null;
		    PreparedStatement stmt = null;
		   int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,payment.getBillNum());
			stmt.setLong(2,payment.getCardNo());
			stmt.setString(3,payment.getCardholName());
			stmt.setDate(4,new java.sql.Date(payment.getExpiryDate().getTime()));
			stmt.setInt(5,payment.getCvvNo());
			stmt.setInt(6,payment.getAmtPaid());
			i = stmt.executeUpdate();
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
	 
	   
	}
