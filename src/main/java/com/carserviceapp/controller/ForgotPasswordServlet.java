package com.carserviceapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.model.CarCustomer;

@WebServlet("/forgotpassword")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	 PrintWriter writer=response.getWriter();
		 Long mobileno=Long.parseLong(request.getParameter("forgotpassword"));
		 String password=request.getParameter("updatepassword");
		 CarCustomer obj1 = new CarCustomer(mobileno,password);
		 CarCustomerDAOImpl cent = new CarCustomerDAOImpl ();
		 boolean flag = cent.forgotpassword(obj1);
		 if(flag)
		 {
			  writer.print("<script type=\"text/javascript\"> alert('Password Updated Successfully'); window.location = 'logIn.jsp';</script>");
		  }
		 
	}

}
