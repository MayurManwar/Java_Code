package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	System.out.println("1");
	Class.forName("com.mysql.jdbc.Driver");
	
	System.out.println("2");
	
	Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
	System.out.println("3");
	
	Statement st=cn.createStatement();
	
	 String query="select * from state";
	 
	
	ResultSet mm  =st.executeQuery(query);
	
	
	while (mm.next()) {
	String id=	mm.getString(1);
		String Dist =mm.getString(2);
	String collector= 	mm.getString(3);
	
	System.out.println(id + " " + Dist +" " + collector );
		
	}
}
	
	
}
