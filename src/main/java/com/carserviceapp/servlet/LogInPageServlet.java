package com.carserviceapp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.exception.InvalidUserException;
import com.carserviceapp.model.CarCustomer;

/**
 * Servlet implementation class LogInPageServlet
 */
@WebServlet("/loginpage")
public class LogInPageServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
//		doGet(request, response);
		   HttpSession session =request.getSession();
		   String username=request.getParameter("uname");
		   String password=request.getParameter("psw");
		   CarCustomer obj1 = new CarCustomer(username,password);
		   CarCustomerDAOImpl cust = new CarCustomerDAOImpl();
		   cust.fetch(obj1);
		   int user_id = 0;
		try {
			user_id = cust.fetchid(obj1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println(user_id);
		   session.setAttribute("username", username);
		   session.setAttribute("password", password);
		   session.setAttribute("userid",user_id);
		  System.out.println(session.getAttribute(("userid").toString()));
		    String val = null;
			CarCustomer userpasscheck = new CarCustomer(username,password);
			val = cust.fetch(userpasscheck);
			session.setAttribute("user", val);
			session.setAttribute("admin", val);
			session.setAttribute("invalid", val);
			if (val.equals("user")) {
				response.sendRedirect("UserPage.jsp");
			} else if (val.equals("admin")) {
				response.sendRedirect("AdminPage.jsp");
			}
			else if(val.equals("invalid"))
			{
				response.sendRedirect("UserUnSuscribe.jsp");
			}
			else 
			{
				try
				{
				   throw new InvalidUserException();	
				}catch(InvalidUserException e)
				{
				   String invaliduser = e.getMessage();
				   response.sendRedirect("UserPageWarn.jsp?message="+e.getMessage()+"&url=LogIn.jsp");
				}
			}
	}
}
