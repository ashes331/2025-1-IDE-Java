package proj0416;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1 extends JFrame {
	
	Ex1() {
		this.setTitle("�ǳڿ���");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JLabel Lab = new JLabel("���̽�ũ���� �����ϳ���?? ");
		
		JButton btnYes = new JButton("Yes");
		JButton btnNo = new JButton("No");
		
		this.add(Lab);
		this.add(btnYes);
		this.add(btnNo);
		
		btnYes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("��, ���̽�ũ���� �����մϴ�.");
			}
		});
		
		btnNo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("�ƴϿ�, ���̽�ũ���� �������� �ʽ��ϴ�.");
			}
		});
		
		this.setSize(300, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Ex1();
	}
}
