package com.carserviceapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.model.CenterDetails;

@WebServlet("/SearchUserOne")
public class SearchUserOneServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	CenterDetailsDAOImpl center1 = new CenterDetailsDAOImpl();
    	List<CenterDetails> centerlist = center1.showsview();
    	request.setAttribute("centerlist",centerlist);
		RequestDispatcher rd=request.getRequestDispatcher("searchUserOne.jsp");
		rd.forward(request, response);
    	
	}

}
