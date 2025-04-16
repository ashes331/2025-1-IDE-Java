package proj0416;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex2 extends JFrame {
	
	Ex2() {
		this.setTitle("LOGIN FORM");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 2));
		
		JTextField InEmail = new JTextField(" ");
		JPasswordField InPassword = new JPasswordField("");
		JButton btnLogin = new JButton("로그인");
		JButton btnCancel = new JButton("취소");
		
		this.add(new JLabel(" 이메일"));
		this.add(InEmail);
		this.add(new JLabel(" 비밀번호"));
		this.add(InPassword);
		this.add(btnLogin);
		this.add(btnCancel);
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String strEmail = InEmail.getText();
				String strPassword = InPassword.getText();
				
				if (strEmail.isEmpty() || strPassword.isEmpty()) {
		            System.out.println("이메일과 비밀번호를 다시 입력하십시오.");
		        } else {		        
		            try {
		                System.out.println("이메일 : " + strEmail + "\n" + "비밀번호 : " + strPassword + "\n" + "는 로그인 되었습니다.");
		            } catch (Exception e2) {
		                System.out.println("로그인 중 오류가 발생했습니다.");
		            }
		        }
		    }
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				InEmail.setText("");
				InPassword.setText("");
			}
		});
		
		this.setSize(450, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Ex2();
	}
}
