package com.carserviceapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarServicesDAOImpl;
import com.carserviceapp.model.CarServices;

@WebServlet("/servicedetail")
public class AddServicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String servicename = request.getParameter("servname");
		int servicecost = Integer.parseInt(request.getParameter("servcost"));
		String servicedesc = request.getParameter("servdesc");
		CarServices obj1 = new CarServices(servicename, servicecost, servicedesc);
		CarServicesDAOImpl cent = new CarServicesDAOImpl();
		boolean check = cent.insert(obj1);
		if (check) {
			writer.print(
					"<script type=\"text/javascript\"> alert('Service is Added Successfully'); window.location = 'adminPage.jsp';</script>");
		}
	}

}
