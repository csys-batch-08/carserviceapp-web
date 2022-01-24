package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangePasswordBack
 */
@WebServlet("/updateback11")
public class ChangePasswordBack extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session =request.getSession();
		if(session.getAttribute("user").equals("user"))
		{
			  response.sendRedirect("UserPage.jsp");
		}
		else if(session.getAttribute("admin").equals("admin"))
		{
			  response.sendRedirect("AdminPage.jsp");
		}
	}

}
