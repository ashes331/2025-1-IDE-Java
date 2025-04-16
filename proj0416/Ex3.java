package proj0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class Ex3 extends JFrame {
	
	ArrayList<Student> studentList = new ArrayList<Student>();

	// 생성자
	Ex3(){
		this.setTitle("학생관리 시스템(GridLayout Sample)");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(6, 2));
		
		
		JTextField InName = new JTextField(" ");
		JTextField InHb = new JTextField(" ");
		JTextField InDept = new JTextField(" ");
		JTextField InSub = new JTextField(" ");
		JButton btnIn = new JButton("입력");
		JButton btnCancel = new JButton("취소");
		JButton btnSave = new JButton("조회 및 파일저장");
		JButton btnSearch = new JButton("이름으로 검색");
		
		
		this.add(new JLabel(" 이름"));
		this.add(InName);
		this.add(new JLabel(" 학번"));
		this.add(InHb);
		this.add(new JLabel(" 학과"));
		this.add(InDept);
		this.add(new JLabel(" 과목"));
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
				System.out.println(strName + " 님, 입력 완료.");
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
					System.out.println("파일 저장 완료.");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("파일 저장 오류.");
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
