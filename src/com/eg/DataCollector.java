package com.eg;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.core.Dao;
import com.core.DbConnectionProvider;

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
		request.setAttribute("employeeId", employeeId);
		/*HttpSession session = response.*/
		DbConnectionProvider dbcp = new DbConnectionProvider();
		Connection con = dbcp.getConnection(getServletConfig().getInitParameter("url"),
				getServletConfig().getInitParameter("username"), getServletConfig().getInitParameter("driver"));
		//ServletContext sc = request.getSession().getServletContext();
		//sc.setAttribute("name", "hai");
		String ano = "what";
		this.getServletConfig().getServletContext().setAttribute("nam", ano);
		this.getServletConfig().getServletContext().setAttribute("dbconnection", con);
		/*RequestDispatcher some = request.getRequestDispatcher("Temporary");
		some.forward(request, response);*/

		if (Dao.valueSetter(con, employeeId, name, mobNo)) {
			RequestDispatcher rd = request.getRequestDispatcher("surveyQuestions.jsp");
			response.getWriter().println("<input type=\"hidden\" name=\"employeeId\" value="+employeeId);				
			rd.forward(request, response);

		}	
			//response.sendRedirect("surveyQuestions.jsp");
		else {
			// response.sendRedirect("index.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			response.getWriter().print(
					"<font style=\"color: red; text-align: center\">Sorry you have already participated in the survey</font>");
			response.setContentType("text/html");
			rd.include(request, response);

		}

	}

}
