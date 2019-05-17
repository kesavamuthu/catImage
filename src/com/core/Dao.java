package com.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	public static boolean valueSetter(Connection con, int id, String name, int mobno) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into detailsForSurveyDetails values (?, ?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, mobno);

			return ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("we caught the exception");
		}
		return false;

	}

}
