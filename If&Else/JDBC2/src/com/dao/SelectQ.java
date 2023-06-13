package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Mayur;
import com.configuration.Config;

public class SelectQ {

	public ArrayList<Mayur> select() throws SQLException{
		
		Connection cn=Config.m1();
		
		PreparedStatement ss=cn.prepareStatement("select * from movie");
		
		ResultSet rs= ss.executeQuery();
		ArrayList<Mayur> al =new ArrayList<>();
		
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String actor = rs.getString(3);
			
			Mayur sl=new Mayur();
			sl.setId(id);
			sl.setName(name);
			sl.setActor(actor);
			
			al.add(sl);
			
					}
		return al;

		
	}
	
}
