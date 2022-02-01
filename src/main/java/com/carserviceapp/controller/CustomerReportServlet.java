package com.carserviceapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.model.CarCustomer;

@WebServlet("/CustomerReports")
public class CustomerReportServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarCustomerDAOImpl ccdao = new CarCustomerDAOImpl();
		List<CarCustomer> custlist = ccdao.view();
		if (!custlist.isEmpty())
		{
			request.setAttribute("custlist",custlist);
			RequestDispatcher rd=request.getRequestDispatcher("customerReportsOne.jsp");
			rd.forward(request, response);
		}
	}

}
