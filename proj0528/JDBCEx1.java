package proj0528;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("db connect Ok");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db connect Error");
			e.printStackTrace();
		}

	}

}
