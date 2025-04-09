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
		JButton btnOK = new JButton("Ȯ��");
		JButton btnCancel = new JButton("���");
		
		
		this.add(new JLabel(" �̸�"));
		this.add(name);
		this.add(new JLabel(" �й�"));
		this.add(stuld);
		this.add(new JLabel(" �а�"));
		this.add(major);
		this.add(new JLabel(" ����"));
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
				
				System.out.println("�̸� : " + Na + ", " + "�й� : " + St + ", " + "�а� : " + Maj + ", " + "���� : " + Sub + "Ȯ�� �Ϸ�!");
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
