package com.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionProvider {
	private String password = "laps";
public Connection getConnection(String url, String username, String driver) {
	Connection con = null;
	try {
	Class.forName(driver);
	con = DriverManager.getConnection(url, username, password);
	return con;
	}
	catch(SQLException  e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return con;
}
}
