package com.carserviceapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.daoimpl.CarServicesDAOImpl;
import com.carserviceapp.model.CarCustomer;
import com.carserviceapp.model.CarServices;

@WebServlet("/updatepassword")
public class UserUpdatePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		doGet(request, response);
		 HttpSession session =request.getSession();
	      int userid=Integer.parseInt(session.getAttribute("userid").toString());
		 String password=request.getParameter("updatepassword");
		 CarCustomer obj1 = new CarCustomer(userid,password);
		 CarCustomerDAOImpl cent = new CarCustomerDAOImpl ();
		 boolean flag = cent.update(obj1);
		 if(flag)
		 {
			  session.setAttribute("passchange", true);
		       response.sendRedirect("logIn.jsp");
		  }
	}

}
