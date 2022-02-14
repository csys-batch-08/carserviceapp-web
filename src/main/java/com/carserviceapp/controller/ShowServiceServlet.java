package com.carserviceapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarServicesDAOImpl;
import com.carserviceapp.model.CarServices;

@WebServlet("/serviceshow")
public class ShowServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CarServicesDAOImpl service = new CarServicesDAOImpl();
		List<CarServices> showservice = service.view();
		if (!showservice.isEmpty()) {
			request.setAttribute("showservice", showservice);
			RequestDispatcher rd = request.getRequestDispatcher("showServices.jsp");
			rd.forward(request, response);
		}
	}

}
