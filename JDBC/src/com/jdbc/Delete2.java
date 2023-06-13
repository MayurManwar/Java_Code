package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete2 {
	
	
	
	
	void delect(int id) throws ClassNotFoundException, SQLException{
		
		
	
		
	Class.forName("com.mysql.jdbc.Driver");
	
	
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
	
	
	PreparedStatement mm=cn.prepareStatement("Delete from teacher where id=?");
	
	mm.setInt(1, id);
	
	 
	

int mayur=	mm.executeUpdate();
		
	

System.out.println("delete="+ mayur);
	}
	
	
	
	
	
}
