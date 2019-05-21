package com.eg;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.core.Dao;
import com.core.DbConnectionProvider;

/**
 * Servlet implementation class DataCollector
 */
public class DataCollector extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String employeeId = request.getParameter("empid");
		String name = request.getParameter("name");
		int mobNo = Integer.parseInt(request.getParameter("mobno"));
		HttpSession session = request.getSession();
		session.setAttribute("empid", employeeId);
		DbConnectionProvider dbcp = new DbConnectionProvider();
		Connection con = dbcp.getConnection(getServletConfig().getInitParameter("url"),
				getServletConfig().getInitParameter("username"), getServletConfig().getInitParameter("driver"));
		this.getServletConfig().getServletContext().setAttribute("dbconnection", con);
		if (Dao.valueSetter(con, employeeId, name, mobNo)) {
			RequestDispatcher rd = request.getRequestDispatcher("surveyQuestions.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			response.getWriter().print(
					"<font style=\"color: red; text-align: center\">Sorry you have already participated in the survey</font>");
			response.setContentType("text/html");
			rd.include(request, response);
		}

	}

}
