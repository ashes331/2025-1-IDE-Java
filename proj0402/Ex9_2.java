package proj0402;

import java.awt.FlowLayout;

import javax.swing.*;
// import javax.swing.JButton;
// import javax.swing.JFrame;

public class Ex9_2 extends JFrame {
	// ������
	Ex9_2() {
		this.setTitle("��ư 3�� �߰� GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Ȯ��");
		this.add(btn1);
		this.add(new JButton("���"));
		this.add(new JButton("����"));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Ex9_2();

	}

}
