package proj0604;

import java.sql.*;

public class DBConn {

	public static Connection dbConnection() {
			
		Connection conn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("db connect Ok");
			return conn;
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			System.out.println("db connect Error");
			return null;
			
		}	
	}
}
