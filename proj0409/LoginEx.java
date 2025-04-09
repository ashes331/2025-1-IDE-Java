package proj0409;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEx extends JFrame {
	
	LoginEx() {
		this.setTitle("Login Main");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3, 2, 0, 5);
		this.setLayout(grid);
		
		JTextField id = new JTextField("");
		JPasswordField pwd = new JPasswordField("");
		JButton btnLogin = new JButton("로그인");
		JButton btnCancel = new JButton("취소");
		
		
		this.add(new JLabel(" 사용자ID"));
		this.add(id);
		this.add(new JLabel(" 비밀번호"));
		this.add(pwd);
		this.add(btnLogin);
		this.add(btnCancel);
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String strId = id.getText();
				String strPwd = pwd.getText();
				System.out.println(strId + ", " + strPwd);
				if (strId.equals("dongyang") && strPwd.equals("1234")) {
					System.out.println("로그인에 성공하셨습니다.");
				} else
					System.out.println("ID 혹은 PW 가 틀립니다. 다시 입력해주세요.");
				
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				id.setText("");;
				pwd.setText("");
				
			}
		});
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginEx();
	}
}