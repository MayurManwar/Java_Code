package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("2");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
		System.out.println("3");
		Statement st = cn.createStatement();
		System.out.println("3");
		String query = "insert into it (id,name)values(2,'tcs')";
		int check = st.executeUpdate(query);

		System.out.println("data insered=" + check);

	}

}
