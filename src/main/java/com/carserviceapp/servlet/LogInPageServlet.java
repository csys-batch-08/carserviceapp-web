package com.carserviceapp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.exception.InvalidUserException;
import com.carserviceapp.model.CarCustomer;


@WebServlet("/loginpage")
public class LogInPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		   HttpSession session =request.getSession();
		   String username=request.getParameter("uname");
		   String password=request.getParameter("psw");
		   CarCustomer obj1 = new CarCustomer(username,password);
		   CarCustomerDAOImpl cust = new CarCustomerDAOImpl();
		   cust.fetch(obj1);
		   int getuserid = 0;
		try {
			getuserid = cust.fetchid(obj1);
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		   session.setAttribute("username", username);
		   session.setAttribute("password", password);
		   session.setAttribute("userid",getuserid);
		    String val = null;
			CarCustomer userpasscheck = new CarCustomer(username,password);
			val = cust.fetch(userpasscheck);
			session.setAttribute("user", val);
			session.setAttribute("admin", val);
			session.setAttribute("invalid", val);
			if (val.equals("user")) {
				response.sendRedirect("UserPage.jsp");
			} else if (val.equals("admin")) {
				RequestDispatcher rd=request.getRequestDispatcher("AdminPage.jsp");
				rd.forward(request, response);
			}
			else if(val.equals("invalid"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("UserUnSuscribe.jsp");
				rd.forward(request, response);
			}
			else 
			{
				try
				{
				   throw new InvalidUserException();	
				}catch(InvalidUserException e)
				{
				   response.sendRedirect("UserPageWarn.jsp?message="+e.getMessage()+"&url=LogIn.jsp");
				}
			}
	}
}
