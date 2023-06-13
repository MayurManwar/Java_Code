package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.configuration.Config;

public class UpdateDao {
	
	
	void update(int id,String name) throws SQLException{
		
	Connection cn	=Config.m1();
	
	
	PreparedStatement ps=cn.prepareStatement("UPDATE  movie set name=? WHERE id=?");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		
		
	int chiku=	ps.executeUpdate();
	
	System.out.println("update="+chiku);
		
	}
	
	

}
