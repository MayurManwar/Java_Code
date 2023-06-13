package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {

	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection mm=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
	
Statement st=	mm.createStatement();
	
String query= "UPDATE student SET  name=54 WHERE id=33";

	int mayu  =st.executeUpdate(query);
	
	
	System.out.println("updated="+mayu);
	
}
	
}
