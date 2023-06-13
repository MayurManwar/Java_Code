package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.configuration.Config;

public class deleteDao2 {

	public static void main(String[] args) throws SQLException {
		
		
		
	Connection cn=	Config.m1();
	Statement st=	cn.createStatement();
	
	String query="Delete from movie where id =67";
	
	int mayur=st.executeUpdate(query);
	
System.out.println("Delete="+mayur);
	}

}
