package proj0402;

import javax.swing.*;
import java.awt.*;

public class LoginEx extends JFrame {
	
	LoginEx() {
		this.setTitle("Login Main");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);
		
		this.setLayout(grid);
		this.add(new JLabel(" �����ID"));
		this.add(new JTextField(""));
		this.add(new JLabel(" ��й�ȣ"));
		// this.add(new JTextField(""));
		// ���̴� ��й�ȣ ( * ó�� X)
		this.add(new JPasswordField(""));
		// �Ⱥ��̴� ��й�ȣ ( * ó�� O)
		this.add(new JButton("�α���"));
		this.add(new JButton("���"));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginEx();

	}

}
