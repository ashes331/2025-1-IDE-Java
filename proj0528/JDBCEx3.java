package proj0528;

import java.io.*;
import java.sql.*;

public class JDBCEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root","dongyang");
			System.out.println("sampledb connect Ok");
			
			Statement stmt = conn.createStatement();
			// String sql = "select * from student;";
			// String sql2 = "insert into student values('0000002', '이정후', '체육학과')";
			// String sql3 = "update student set dept='샌디에이고', where name='이정후'; ";
			String sql4 = "delete from student where name='김철수'; ";
			stmt.executeUpdate(sql4);
			System.out.println("입력 완료");
			
			
			stmt.close();
			conn.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated method stub
			System.out.println("db connect Error");
			e.printStackTrace();
		}

	}

	

}
