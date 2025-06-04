package proj0604;

import java.sql.*;

public class PreTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("db connect Ok");
			
			String sql = "insert into student values(?, ?, ?);";
			String inid = "2025001";
			String inname = "홍길동";
			String indept = "인공지능";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inid);
			pstmt.setString(2, inname);
			pstmt.setString(3, indept);
			pstmt.executeUpdate(); // 실행
			
			System.out.println(inname + "입력 성공");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db connect Error");
			e.printStackTrace();
		}

	}

}
