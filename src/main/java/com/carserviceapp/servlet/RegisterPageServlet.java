package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.exception.ExistEmailIdException;
import com.carserviceapp.exception.ExistMobileNoException;
import com.carserviceapp.model.CarCustomer;


@WebServlet("/carserviceuserone")
public class RegisterPageServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	 public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
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
		   String sameemail=cust.getEmail(obj2);
		   Long samemobile=cust.getMobile(obj2);
  try { 
		   if(email.equals(sameemail))
		   {
			   throw new ExistEmailIdException();
		   }  
		   if(mobileno.equals(samemobile))
		   {
			    throw new ExistMobileNoException();
		   }
		   boolean check=cust.insert(obj1);
		   if(check)
		   {
		   response.sendRedirect("logIn.jsp");
		   }
       }
  catch (ExistMobileNoException e)
  {
	   response.sendRedirect("existMobile.jsp");
   } 
 catch( ExistEmailIdException d)
  {
	 response.sendRedirect("existEmail.jsp");
  }
  catch (IOException e) 
           {
			e.getCause();
		   }
	   }
}
