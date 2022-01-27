package com.carserviceapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserPageWarn")
public class UserPageWarnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	  String message=request.getParameter("message");
          String url=request.getParameter("url");
          request.setAttribute("message", message);
          request.setAttribute("url", url);
      	  RequestDispatcher rd=request.getRequestDispatcher("UserPageWarn.jsp");
		  rd.forward(request, response);
	}

}
