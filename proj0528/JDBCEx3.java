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
			System.out.println("sampledb ���� �Ϸ�");
			
			Statement stmt = conn.createStatement();
			// String sql = "select * from student;";
			// String sql2 = "insert into student values('0000002', '������', 'ü���а�')";
			// String sql3 = "update student set dept='�����̰�', where name='������'; ";
			String sql4 = "delete from student where name='��ö��'; ";
			stmt.executeUpdate(sql4);
			System.out.println("�Է� �Ϸ�");
			
			
			stmt.close();
			conn.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated method stub
			System.out.println("db ���� ����");
			e.printStackTrace();
		}

	}

	

}
