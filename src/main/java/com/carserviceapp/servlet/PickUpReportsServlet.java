package com.carserviceapp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.daoimpl.CarPickUpDAOImpl;
import com.carserviceapp.model.CarCustomer;
import com.carserviceapp.model.CarPickUp;

@WebServlet("/PickUpReports")
public class PickUpReportsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		CarPickUpDAOImpl ccdao = new CarPickUpDAOImpl();
		List<CarPickUp> pickuplist = ccdao.pickupview();
		if (!pickuplist.isEmpty())
		{
			request.setAttribute("pickuplist",pickuplist);
			RequestDispatcher rd=request.getRequestDispatcher("pickUpReports.jsp");
			rd.forward(request, response);
		}
	}

}
