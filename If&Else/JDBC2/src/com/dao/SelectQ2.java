package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Entity.Mayur;
import com.configuration.Config;

public class SelectQ2 {
	
	
	
	
	ArrayList<Mayur> select() throws SQLException{
		
Connection cn=	Config.m1();	
		Statement st=cn.createStatement();
		
		
		String query= "Select * from  movie";
		ResultSet ll=st.executeQuery(query);

		ArrayList<Mayur> bb=new ArrayList<>();
		while (ll.next()) {
			
			int id = ll.getInt(1);
			String name = ll.getString(2);
			String actor = ll.getString(3);
			
			
			Mayur ss=new Mayur();
			
			ss.setId(id);
			ss.setName(name);
			ss.setActor(actor);
			
			
		bb.add(ss);
			
			
		
		
		}

		return bb;
	}
}