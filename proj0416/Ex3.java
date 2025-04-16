package proj0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class Ex3 extends JFrame {
	
	ArrayList<Student> studentList = new ArrayList<Student>();

	// ������
	Ex3(){
		this.setTitle("�л����� �ý���(GridLayout Sample)");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(6, 2));
		
		
		JTextField InName = new JTextField(" ");
		JTextField InHb = new JTextField(" ");
		JTextField InDept = new JTextField(" ");
		JTextField InSub = new JTextField(" ");
		JButton btnIn = new JButton("�Է�");
		JButton btnCancel = new JButton("���");
		JButton btnSave = new JButton("��ȸ �� ��������");
		JButton btnSearch = new JButton("�̸����� �˻�");
		
		
		this.add(new JLabel(" �̸�"));
		this.add(InName);
		this.add(new JLabel(" �й�"));
		this.add(InHb);
		this.add(new JLabel(" �а�"));
		this.add(InDept);
		this.add(new JLabel(" ����"));
		this.add(InSub);
		
		this.add(btnIn);
		this.add(btnCancel);
		this.add(btnSave);
		this.add(btnSearch);
		
		btnIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String strName = InName.getText();
				String strHb = InHb.getText();
				String strDept = InDept.getText();
				String strSub = InSub.getText();
				
				studentList.add(new Student(strName, strHb, strDept, strSub));
				System.out.println(strName + " ��, �Է� �Ϸ�.");
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				InName.setText("");
				InHb.setText("");
				InDept.setText("");
				InSub.setText("");
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					FileWriter fout = new FileWriter("c:\\20241491.csv");
					for (Student one : studentList) {
						fout.write(one.getName() + ", " + one.getHb() + ", " + one.getDept() + ", " + one.getSub() + "\n");
						System.out.println(one);
					}
					fout.close();
					System.out.println("���� ���� �Ϸ�.");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("���� ���� ����.");
				}
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String searchName = InName.getText();  

                boolean found = false;
                for (Student student : studentList) {
                    if (student.getName().equals(searchName)) {

                        InName.setText(student.getName());
                        InHb.setText(student.getHb());
                        InDept.setText(student.getDept());
                        InSub.setText(student.getSub());
                        found = true;
                        break;
                    }
                }
			}
		});
		
		
		
		
		
		
		
		
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex3();
	}

}
