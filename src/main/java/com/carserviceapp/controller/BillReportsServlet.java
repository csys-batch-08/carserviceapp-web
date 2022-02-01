package com.carserviceapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.BillDetailsDAOImpl;
import com.carserviceapp.model.BillDetails;

@WebServlet("/BillReports")
public class BillReportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     { 
         BillDetailsDAOImpl bDao = new BillDetailsDAOImpl();
 		 List<BillDetails> billlist = bDao.adminview();
 			request.setAttribute("billlist",billlist);
 			RequestDispatcher rd=request.getRequestDispatcher("billReportsOne.jsp");
 			rd.forward(request, response);
	}

}
