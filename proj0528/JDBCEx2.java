package proj0528;

import java.io.*;
import java.sql.*;


public class JDBCEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root","dongyang");
			System.out.println("sampledb 연결 완료");
			
			Statement stmt = conn.createStatement();
			String sql = "select * from student;";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				System.out.print(rs.getString("id"));
				System.out.print("\t | " + rs.getString("name"));
				System.out.print("\t | " + rs.getString("dept"));
			}
			rs.close();
			stmt.close();
			conn.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated method stub
			System.out.println("db 연결 오류");
			e.printStackTrace();
		}

	}

}
