package proj0409;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutEx extends JFrame {
	
	GridLayoutEx() {
		this.setTitle("Login Main");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		this.setLayout(grid);
		
		JTextField name = new JTextField(" ");
		JTextField stuld = new JTextField(" ");
		JTextField major = new JTextField(" ");
		JTextField sub = new JTextField(" ");
		JButton btnOK = new JButton("확인");
		JButton btnCancel = new JButton("취소");
		
		
		this.add(new JLabel(" 이름"));
		this.add(name);
		this.add(new JLabel(" 학번"));
		this.add(stuld);
		this.add(new JLabel(" 학과"));
		this.add(major);
		this.add(new JLabel(" 과목"));
		this.add(sub);
		this.add(btnOK);
		this.add(btnCancel);
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String Na = name.getText();
				String St = stuld.getText();
				String Maj = major.getText();
				String Sub = sub.getText();
				
				System.out.println("이름 : " + Na + ", " + "학번 : " + St + ", " + "학과 : " + Maj + ", " + "과목 : " + Sub + "확인 완료!");
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				name.setText("");;
				stuld.setText("");
				major.setText("");
				sub.setText("");
			}
		});
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();

	}

}
