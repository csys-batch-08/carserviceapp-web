package com.carserviceapp.servlet;

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

@WebServlet("/pickupform")
public class SearchUserThreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        CarServicesDAOImpl service = new CarServicesDAOImpl();
        List<CarServices> servicelist = service.views();
        request.setAttribute("servicelist",servicelist);
		RequestDispatcher rd=request.getRequestDispatcher("searchUserThree.jsp");
		rd.forward(request, response);
	}

}
