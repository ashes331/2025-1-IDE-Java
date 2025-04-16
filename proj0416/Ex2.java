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
		JButton btnLogin = new JButton("�α���");
		JButton btnCancel = new JButton("���");
		
		this.add(new JLabel(" �̸���"));
		this.add(InEmail);
		this.add(new JLabel(" ��й�ȣ"));
		this.add(InPassword);
		this.add(btnLogin);
		this.add(btnCancel);
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String strEmail = InEmail.getText();
				String strPassword = InPassword.getText();
				
				if (strEmail.isEmpty() || strPassword.isEmpty()) {
		            System.out.println("�̸��ϰ� ��й�ȣ�� �ٽ� �Է��Ͻʽÿ�.");
		        } else {		        
		            try {
		                System.out.println("�̸��� : " + strEmail + "\n" + "��й�ȣ : " + strPassword + "\n" + "�� �α��� �Ǿ����ϴ�.");
		            } catch (Exception e2) {
		                System.out.println("�α��� �� ������ �߻��߽��ϴ�.");
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
