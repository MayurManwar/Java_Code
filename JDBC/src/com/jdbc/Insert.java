 package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection mm = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		Statement st = mm.createStatement();

		String query = " insert into student (id,name ,mark) values (88,'amar',85)";

		int mayur = st.executeUpdate(query);

		System.out.println("inserted =" + mayur);

	}

}
