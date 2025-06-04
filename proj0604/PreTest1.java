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
			String inname = "ȫ�浿";
			String indept = "�ΰ�����";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inid);
			pstmt.setString(2, inname);
			pstmt.setString(3, indept);
			pstmt.executeUpdate(); // ����
			
			System.out.println(inname + "�Է� ����");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db connect Error");
			e.printStackTrace();
		}

	}

}
