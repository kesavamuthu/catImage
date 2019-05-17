package com.core;

import java.sql.Connection;
import java.sql.DriverManager;

public class QADao {
	
	public static void dataSaver(BeanAnswers ba){
		String driver = "oracle.jdbc.driver.OracleDriver";
		String username = "TRAINING_DB";
		String password = "laps";
		String connectionurl = "jdbc:oracle:thin:@192.168.0.5:1521:ORCL";
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connectionurl, username, password);
			PreparedStatement ps = con.prepareStatement("")
		}
			
			
	}

}
