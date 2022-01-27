package com.carserviceapp.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.exception.ExistEmailIdException;
import com.carserviceapp.exception.ExistMobileNoException;
import com.carserviceapp.model.CarCustomer;

/**
 * Servlet implementation class carservice
 */
@WebServlet("/carserviceuser12")
public class RegisterPageServlet extends HttpServlet 
{
	
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {	 
		   String username=request.getParameter("user");
		   Long mobileno = Long.parseLong(request.getParameter("mob"));
		   String password=request.getParameter("password");
		   String email=request.getParameter("email");
		   String address=request.getParameter("address");
		   CarCustomer obj1 = new CarCustomer(username,mobileno,password,email,address);
		   CarCustomerDAOImpl cust = new CarCustomerDAOImpl();	   
		   String dummy="";
		   CarCustomer obj2 = new CarCustomer(mobileno,email,dummy);
		   ResultSet rs=cust.getEmail(obj2);
		   ResultSet rs1=cust.getMobile(obj2);
  try { 
		   if(rs.next())
		   {
			   if(email.equals(rs.getString(5)))
			   {
				   throw new ExistEmailIdException();
			   }
		   }  
		   if(rs1.next())
		   {
			   if(mobileno.equals(rs1.getLong(3)))
			   {
				   throw new ExistMobileNoException();
			   }
		   }
		   boolean k=cust.insert(obj1);
		   if(k==true)
		   {
		   response.sendRedirect("LogIn.jsp");
		   }
       }
  catch (ExistMobileNoException | ExistEmailIdException d)
  {
	   response.sendRedirect("UserPageWarn.jsp?message="+d.getMessage()+"&url=RegisterPage.jsp");
   } 
  catch (IOException | SQLException e) 
           {
			e.printStackTrace();
		   }
	   }
}
