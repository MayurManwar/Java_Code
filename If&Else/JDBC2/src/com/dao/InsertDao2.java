package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.configuration.Config;

public class InsertDao2 {
	
	
	
	public static void main(String[] args) throws SQLException {
		
	Connection cn=	Config.m1();
	Statement st=	cn.createStatement();
		
	
	String query ="insert into movie (id,name,actor)value(89,'dangal','amir')";
		
	int mayur=st.executeUpdate(query);
	
		System.out.println("Insert="+mayur);
	}

}
