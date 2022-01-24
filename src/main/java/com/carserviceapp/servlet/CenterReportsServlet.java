package com.carserviceapp.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import com.carserviceapp.exception.InvalidUserException;
import com.carserviceapp.model.CarPickUp;

/**
 * Servlet implementation class CenterReportsServlet
 */
@WebServlet("/centerreports")
public class CenterReportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CenterReportsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   HttpSession session =request.getSession();
		   int center_id=Integer.parseInt(request.getParameter("centerid"));
		   session.setAttribute("centerid",center_id);
		   CarPickUp admincenter = new CarPickUp(center_id);
		   CarPickUpDAOImpl cpdao = new CarPickUpDAOImpl();
		   List<CarPickUp> viewcenters = cpdao.admincenterview(admincenter);
		try {
				if (!viewcenters.isEmpty())
				{
					request.setAttribute("viewcenters",viewcenters);
					RequestDispatcher rd=request.getRequestDispatcher("CenterReportsTwo.jsp");
					rd.forward(request, response);
				}
				else 
				{
				 try{
						throw new CenterNotFoundException();
					}
				 catch(CenterNotFoundException e)
					{
					   String invalidcenter = e.getMessage();
					   response.sendRedirect("UserPageWarn.jsp?message="+e.getMessage()+"&url=CenterReportsOne.jsp");
					}
				}
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			}	  
	}
