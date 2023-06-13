package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Mayur;
import com.configuration.Config;

public class InsertDao {
	
public boolean selectInsert(int id,String name,String actor) throws SQLException{
		
		Connection cn=Config.m1();
		
		PreparedStatement ps=cn.prepareStatement("insert  into  movie(id,name,actor) value(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, actor);
		
	
		int isInserted =ps.executeUpdate();
		 
		if(isInserted==1){
			
			
			return true;
		}else {
			
			return false;
		}
		
		
		
		
}
	
}
