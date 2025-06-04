package proj0604;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

public class InputEx1 extends JFrame {
	
	JButton btnInsert, btnDelete, btnUpdate, btnSelect, btnSearch;
	JTextField tfId, tfName, tfDept, tfSearch;
	JTextArea ta;
	JRadioButton rbId, rbName, rbDept;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	FileWriter fout = null;
	
	public InputEx1() {
		
		// �л� �Է� ������Ʈ ȭ�� ����
		this.setTitle("�л� ���� ������Ʈ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dbInsert();
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dbDelete();
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dbUpdate();
			}
		});
		
		btnSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dbSelect();
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dbSearch();
			}
		});
		
		this.setSize(300, 550);
		this.setVisible(true);
	}
	
	// UIȭ���ۼ�
	public void createGUI() {
		
		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("�й�"));
		tfId = new JTextField(20);
		this.add(tfId);
		
		this.add(new JLabel("�̸�"));
		tfName = new JTextField(20);
		this.add(tfName);
		
		this.add(new JLabel("�а�"));
		tfDept = new JTextField(20);
		this.add(tfDept);
		
		btnInsert = new JButton("�Է�");
		this.add(btnInsert);
		
		btnUpdate = new JButton("����");
		this.add(btnUpdate);
		
		btnDelete = new JButton("����");
		this.add(btnDelete);
		
		btnSelect = new JButton("��ȸ");
		this.add(btnSelect);
		
		// �˻��κ�
		tfSearch = new JTextField(18);
		rbId = new JRadioButton("�й�", true);
		rbName = new JRadioButton("�̸�");
		rbDept = new JRadioButton("�а�");
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbId);
		group.add(rbName);
		group.add(rbDept);
		
		btnSearch = new JButton("�˻�");
		JPanel pn1 = new JPanel();
		pn1.add(new JLabel(" "));
		pn1.add(tfSearch);
		pn1.add(btnSearch);
		
		JPanel pn2 = new JPanel();
		pn2.add(rbId);
		pn2.add(rbName);
		pn2.add(rbDept);
		
		JPanel pMiddle = new JPanel(new BorderLayout(0, 0));
		pMiddle.add(BorderLayout.NORTH, pn1);
		pMiddle.add(BorderLayout.CENTER, pn2);
		TitledBorder tb = new TitledBorder("�˻�");
		pMiddle.setBorder(tb);
		this.add(pMiddle);
		
		//
		ta = new JTextArea(15, 20);
		this.add(ta);
	}
	
	// �˻�
	public void dbSearch() {
		
		try {
			conn = DBConn.dbConnection();
			
			String searchText = tfSearch.getText().toString();
			String searchSql = "";
			
			if(rbId.isSelected()) {
				searchSql = "select * from student where id = '" + searchText + "';";
			} else if(rbName.isSelected()) {
				searchSql = "select * from student where name = '" + searchText + "';";
			} else {
				searchSql = "select * from student where dept = '" + searchText + "';";
			}
			
			pstmt = conn.prepareStatement(searchSql);
			rs = pstmt.executeQuery();
			
			String line = "";
			ta.setText("          id          name          dept\n");
			ta.append("--------------------------------------------\n");
			
			while(rs.next()) {
				
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				String id = rs.getString("id");
				line = "  |  " + id + "  |  " + name + "  |  " + dept +"\n";
				System.out.println("rs => " + line);
				ta.append(line);	
			}
			
			pstmt.close();
			conn.close();
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	
	// ��ȸ
	public void dbSelect() {
		
		try {
			conn = DBConn.dbConnection();
			
			String sql = "select * from student";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			String line = "";
			ta.setText("          id          name          dept\n");
			ta.append("--------------------------------------------\n");
			
			while(rs.next()) {
				
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				String id = rs.getString("id");
				line = "  |  " + id + "  |  " + name + "  |  " + dept +"\n";
				System.out.println("rs => " + line);
				ta.append(line);	
			}
			
			pstmt.close();
			conn.close();
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	
	// ����
	public void dbUpdate() {
		
		try {
			conn = DBConn.dbConnection();
			
			String sql = "update student set name = ?, dept = ? where id = ?;";
			String in_id = tfId.getText().toString();
			String in_name = tfName.getText().toString();
			String in_dept = tfDept.getText().toString();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, in_name);
			pstmt.setString(2, in_dept);
			pstmt.setString(3, in_id);
			
			pstmt.executeUpdate();
			System.out.println(in_name + " ���� �Ϸ�");
			
			tfId.setText("");
			tfName.setText("");
			tfDept.setText("");
		
			pstmt.close();
			conn.close();
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("���� ����");
		}	
	}
	
	// �Է�
	public void dbInsert() {
		
		try {
			conn = DBConn.dbConnection();
			
			String in_id = tfId.getText().toString();
			String in_name = tfName.getText().toString();
			String in_dept = tfDept.getText().toString();
			String sql = "insert into student(id, name, dept) values(?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, in_id);
			pstmt.setString(2, in_name);
			pstmt.setString(3, in_dept);
			
			pstmt.executeUpdate();
			System.out.println(in_name + " �Է� �Ϸ�");
			
			tfId.setText("");
			tfName.setText("");
			tfDept.setText("");
		
			pstmt.close();
			conn.close();
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("�Է� ����");
		}	
	}
	
	// ����
	public void dbDelete() {
		
		try {
			conn = DBConn.dbConnection();
			
			String in_id = tfId.getText().toString();
			String sql = "delete from student where id =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, in_id);
			
			pstmt.executeUpdate();
			System.out.println(in_id + " ���� �Ϸ�");
			
			tfId.setText("");
			tfName.setText("");
			tfDept.setText("");
		
			pstmt.close();
			conn.close();
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("���� ����");
		}	
	}
	
	// ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InputEx1();

	}
}
