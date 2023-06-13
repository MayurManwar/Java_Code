package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.configuration.Config;

public class UpdateDao2 {
	
	
	public static void main(String[] args) throws SQLException {
		
		
	Connection cn	=Config.m1();
		
	Statement	st=cn.createStatement();
		
		String query ="UPDATE movie set name='golmal' WHERE id =23";
		
	int mayur=	st.executeUpdate(query);
		
		System.out.println("Update="+mayur);
		
	}

}
