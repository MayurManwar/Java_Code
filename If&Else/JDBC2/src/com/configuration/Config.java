package com.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
	
	
	public static Connection m1(){
		
		
		Connection cn=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			 cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
			
			 		} catch (Exception e) {
			System.out.println("Run Succesfully");

		}
		
		
		return cn;
	}
	
	
	
	
	

}
