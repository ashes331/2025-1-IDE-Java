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
		JButton btnLogin = new JButton("�α���");
		JButton btnCancel = new JButton("���");
		
		
		this.add(new JLabel(" �����ID"));
		this.add(id);
		this.add(new JLabel(" ��й�ȣ"));
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
					System.out.println("�α��ο� �����ϼ̽��ϴ�.");
				} else
					System.out.println("ID Ȥ�� PW �� Ʋ���ϴ�. �ٽ� �Է����ּ���.");
				
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