package com.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QADao {

	public static void dataSaver(BeanAnswers ba, Connection con) {
		try {
			String[] questions = { "Question 1", "Question 2", "Question 3", "Question 4", "Question 5" };
			String[] answers = { ba.getFirst(), ba.getSecond(), ba.getThird(), ba.getFourth(), ba.getFifth() };
			PreparedStatement ps = con.prepareStatement("insert into surveyanswers values(?, ?, ?)");
			for (int i = 0; i < 5; ++i) {
				if (!(answers[i].equals(""))) {
					ps.setString(1, ba.getEmployeeId());
					ps.setString(2, questions[i]);
					ps.setString(3, answers[i]);
					ps.executeUpdate();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
