package com.carserviceapp.daoimpl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

import com.carserviceapp.connection.*;
import com.carserviceapp.dao.CarPaymentDAO;
import com.carserviceapp.model.*;
public class CarPaymentDAOImpl implements CarPaymentDAO
{
	   public int insert(CarPayment payment) 
	   {
		   String insertQuery="insert into payment(bill_num,card_no,cardhol_name,expiry_date,cvv_no,amt_paid) values(?,?,?,?,?,?)";
		   Connection con = null;
		   int i = 0;
		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY-MM");
			con = ConnectionUtil.getDBconnection();
		    PreparedStatement stmt = null;
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1,payment.getBill_num());
			stmt.setLong(2,payment.getCard_no());
			stmt.setString(3,payment.getCardhol_name());
			System.out.println(new java.sql.Date(payment.getExpiry_date().getTime()));
			stmt.setDate(4,new java.sql.Date(payment.getExpiry_date().getTime()));
			stmt.setInt(5,payment.getCvv_no());
			stmt.setInt(6,payment.getAmt_paid());
			i = stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	   }
	 
	   
	}
