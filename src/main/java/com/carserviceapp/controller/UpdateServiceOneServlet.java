package com.carserviceapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateService")
public class UpdateServiceOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int serviceId = (Integer.parseInt(request.getParameter("serviceId")));
		request.setAttribute("serviceId", serviceId);
		RequestDispatcher rd = request.getRequestDispatcher("updateService.jsp");
		rd.forward(request, response);
	}

}
