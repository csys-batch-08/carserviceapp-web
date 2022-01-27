package com.carserviceapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.BillDetailsDAOImpl;
import com.carserviceapp.exception.CenterNotFoundException;
import com.carserviceapp.exception.UserIdNotFoundException;
import com.carserviceapp.model.BillDetails;

/**
 * Servlet implementation class AddBill
 */
@WebServlet("/addbill")
public class AddBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session =request.getSession();
		 DateTimeFormatter formatter =
			     DateTimeFormatter.ofPattern("dd-MM-yyyy");
		int userid = Integer.parseInt(request.getParameter("userid"));
		String date =request.getParameter("servdate");
		System.out.println(date);
		LocalDate servdate = null;
		servdate = LocalDate.parse(date);
		System.out.println(servdate.format(formatter));
		BillDetails c1 = new BillDetails(userid,servdate,userid);
        BillDetailsDAOImpl cDao = new BillDetailsDAOImpl();
        int l=cDao.insert(c1);  
        if(l==1)
		 {
			  session.setAttribute("addbill",true);
		       response.sendRedirect("AdminPage.jsp");
		  }
        else {
			 try
			 {
				 throw new UserIdNotFoundException();
			 }
			 catch(UserIdNotFoundException e)
			 {
				String invaliduserid =e.getMessage();
				response.sendRedirect("UserPageWarn?message="+e.getMessage()+"&url=AddBill.jsp");
			 }	
		 }
	}

}
