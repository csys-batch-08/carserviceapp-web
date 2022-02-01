package com.carserviceapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/updateback11")
public class ChangePasswordBack extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		if(session.getAttribute("user").equals("user"))
		{
			  response.sendRedirect("userPage.jsp");
		}
		else if(session.getAttribute("admin").equals("admin"))
		{
			  response.sendRedirect("adminPage.jsp");
		}
	}

}
