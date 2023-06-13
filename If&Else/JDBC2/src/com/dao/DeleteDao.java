package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.configuration.Config;

public class DeleteDao {
	
	
	
	void delete(int id) throws SQLException{
		
	Connection cn=	Config.m1();
	
	PreparedStatement ss= cn.prepareStatement("Delete from movie where id=?");
		
	
	ss.setInt(1, id);
	
	
	int mayur=ss.executeUpdate();
	
	
		}

	
	
}
