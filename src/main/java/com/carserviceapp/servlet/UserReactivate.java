package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.model.CarCustomer;

@WebServlet("/UserReactivate")
public class UserReactivate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	   HttpSession session = request.getSession(); 
    		 String username=session.getAttribute("username").toString(); 
    	     String password=session.getAttribute("password").toString(); 
    		 CarCustomer cust = new CarCustomer(username,password);
    		 CarCustomerDAOImpl cdao = new CarCustomerDAOImpl();
    		 int l =cdao.reactivate(cust);
    		 if(l==1)
    		 {
    			 response.sendRedirect("logIn.jsp");
    		 }
	}

}
