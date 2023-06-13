package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement ;
import java.sql.SQLException;

public class Insert2 {
	
	
	void m1(int id,String name,String salary) throws ClassNotFoundException, SQLException{
		
		
	Class.forName("com.mysql.jdbc.Driver")	;
		
Connection cn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");	
		

PreparedStatement mm =cn.prepareStatement("insert into teacher (id,name ,salary) values (?,?,?)");
mm.setInt(1, id);
mm.setString(2,name);
mm.setString(3,salary);
 
int insert=mm.executeUpdate();

System.out.println("inserting the value in student ="+mm);

	}

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Insert2 kk=new Insert2();
		kk.m1(16,"nikta","43500");
	}
}
