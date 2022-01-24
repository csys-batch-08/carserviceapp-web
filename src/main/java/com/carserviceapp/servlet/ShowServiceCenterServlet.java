package com.carserviceapp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.model.CarPickUp;
import com.carserviceapp.model.CenterDetails;

/**
 * Servlet implementation class ShowServiceCenterServlet
 */
@WebServlet("/ShowServiceCenter")
public class ShowServiceCenterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		CenterDetailsDAOImpl center1 = new CenterDetailsDAOImpl();
		 List<CenterDetails> showcenter = center1.showview();
					if (!showcenter.isEmpty())
					{
						request.setAttribute("showcenter",showcenter);
						RequestDispatcher rd=request.getRequestDispatcher("ServiceCenterShow.jsp");
						rd.forward(request, response);
					}
	}

}
