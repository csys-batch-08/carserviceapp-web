package com.carserviceapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarPickUpDAOImpl;
import com.carserviceapp.exception.CenterNotFoundException;
import com.carserviceapp.model.CarPickUp;

@WebServlet("/centerreports")
public class CenterReportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int centerid = Integer.parseInt(request.getParameter("centerid"));
		session.setAttribute("centerid", centerid);
		CarPickUp admincenter = new CarPickUp(centerid);
		CarPickUpDAOImpl cpdao = new CarPickUpDAOImpl();
		List<CarPickUp> viewcenters = cpdao.admincenterview(admincenter);
		try {
			if (!viewcenters.isEmpty()) {
				request.setAttribute("viewcenters", viewcenters);
				RequestDispatcher rd = request.getRequestDispatcher("centerReportsTwo.jsp");
				rd.forward(request, response);
			} else {
				throw new CenterNotFoundException();
			}
		} catch (IOException e) {
			e.getCause();
		} catch (CenterNotFoundException e) {
			request.setAttribute("centernotfound", e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("centerReportsOne.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e1) {
				e1.getCause();
			}
		}
	}
}
