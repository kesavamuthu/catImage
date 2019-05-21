package com.eg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.core.BeanAnswers;

/**
 * Servlet implementation class Temporary
 */
public class Temporary extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BeanAnswers ba = new BeanAnswers();
		//System.out.println(ba.getEmployeeId() + ba.getFirst());
		System.out.println(this.getServletContext().getAttribute("nam"));
		Connection con = (Connection) this.getServletContext().getAttribute("dbconnection");
		try {
			PreparedStatement ps = con.prepareStatement("insert into sample1 values (?) ");
			ps.setString(1, "hai");
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
