package com.carserviceapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateCenterOne")
public class UpdateCenterOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int centerId = (Integer.parseInt(request.getParameter("centerId")));
		request.setAttribute("centerId", centerId);
		RequestDispatcher rd = request.getRequestDispatcher("updateServiceCenter.jsp");
		rd.forward(request, response);
	}
}
