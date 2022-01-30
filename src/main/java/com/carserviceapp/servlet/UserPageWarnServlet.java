package com.carserviceapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserPageWarn")
public class UserPageWarnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	  HttpSession session =request.getSession();
    	  String message=request.getParameter("message");
          String url=request.getParameter("url");
          session.setAttribute("message", message);
          session.setAttribute("url", url);
      	  RequestDispatcher rd=request.getRequestDispatcher("userPageWarn.jsp");
		  rd.forward(request, response);
	}

}
