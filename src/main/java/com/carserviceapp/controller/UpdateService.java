package com.carserviceapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarServicesDAOImpl;
import com.carserviceapp.exception.ServiceNotFoundException;
import com.carserviceapp.model.CarServices;

@WebServlet("/updateservice")
public class UpdateService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int serviceid = Integer.parseInt(request.getParameter("serviceid"));
		int newprice = Integer.parseInt(request.getParameter("updateservcost"));
		CarServices obj1 = new CarServices(serviceid);
		CarServicesDAOImpl cent = new CarServicesDAOImpl();
		int checkserviceid = cent.checkserviceid(obj1);
		try {
			if (checkserviceid != 0) {
				CarServices obj2 = new CarServices(serviceid, newprice);
				CarServicesDAOImpl cents = new CarServicesDAOImpl();
				boolean flag = cents.update(obj2);
				if (flag) {
					RequestDispatcher rd = request.getRequestDispatcher("adminPage.jsp?result=addedSuccessfully");
					rd.forward(request, response);
				}
			} else {
				throw new ServiceNotFoundException();
			}
		} catch (ServletException | IOException e1) {
			e1.getCause();
		} catch (ServiceNotFoundException e) {
			response.sendRedirect("serviceNotFound.jsp");
		}

	}
}
