package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("step1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 2");
		Connection kk = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Step 3");

		Statement ss = kk.createStatement();
		String query = "select * from student";

		ResultSet ll = ss.executeQuery(query);
		System.out.println("Step 4");

		System.out.println("!!!********!!!!");

		while (ll.next()) {

			String id = ll.getString(1);
			String name = ll.getString(2);
			String mark = ll.getString(3);

			System.out.println(id + " " + name + " " + mark);

		}

	}
}
