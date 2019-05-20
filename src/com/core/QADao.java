package com.core;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class QADao {
	
	public static void dataSaver(BeanAnswers ba, Connection con){
		try{
			
			PreparedStatement ps = con.prepareStatement("insert into answerforsurveydetails values(?, ?, ?)");
			System.out.println("hai");
			System.out.println(ba.getEmployeeId());
			System.out.println(ba.getFirst());
			System.out.println(ba.getSecond());
			System.out.println(ba.getThird());
		}
		catch(Exception e)
		{
			
		}
			
	}

}
