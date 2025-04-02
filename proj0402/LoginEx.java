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
		this.add(new JLabel(" 사용자ID"));
		this.add(new JTextField(""));
		this.add(new JLabel(" 비밀번호"));
		// this.add(new JTextField(""));
		// 보이는 비밀번호 ( * 처리 X)
		this.add(new JPasswordField(""));
		// 안보이는 비밀번호 ( * 처리 O)
		this.add(new JButton("로그인"));
		this.add(new JButton("취소"));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginEx();

	}

}
