package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Upset2 {

	
	
	
	
	
	
	void update(int id,String name) throws ClassNotFoundException, SQLException{
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		
		
		PreparedStatement mm=cn.prepareStatement("UPDATE teacher SET  name= ? WHERE id=?");
		
		mm.setInt(1, id);
		mm.setString(2,name);
		

	int mayur=	mm.executeUpdate();
			
		

	System.out.println("delete="+ mayur);
		
		
		
		
		

	}
}
