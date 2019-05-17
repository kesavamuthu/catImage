package com.eg;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.core.Dao;

/**
 * Servlet implementation class DataCollector
 */
public class DataCollector extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int employeeId = Integer.parseInt(request.getParameter("empid"));
		String name = request.getParameter("name");
		int mobNo = Integer.parseInt(request.getParameter("mobno"));
		
		if (Dao.valueSetter(employeeId, name, mobNo))
			response.sendRedirect("surveyQuestions.jsp");
		else {
			//response.sendRedirect("index.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			response.getWriter().print("<font style=\"color: red; text-align: center\">Sorry you have already participated in the survey</font>");
			response.setContentType("text/html");
			rd.include(request, response);
		}

	}

}
