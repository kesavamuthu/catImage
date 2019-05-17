package com.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	public static boolean valueSetter(int id, String name, int mobno){
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String connectionUrl = "jdbc:oracle:thin:@192.168.0.5:1521:ORCL";
		String username = "TRAINING_DB";
		String password = "laps";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(connectionUrl,
					username, password);
			PreparedStatement ps = con
					.prepareStatement("insert into detailsForSurveyDetails values (?, ?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, mobno);

			return ps.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("we caught the exception");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return false;

	}

}
