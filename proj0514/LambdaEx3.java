package proj0514;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LambdaEx3 extends JFrame {
	
	LambdaEx3() {
		this.setTitle("���ٽ� ���� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JLabel lb = new JLabel("���̽�ũ���� �����ϳ���?");
		JButton btnOk = new JButton("Yes");
		JButton btnNo = new JButton("No");
		
//		btnOk.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("��, �����մϴ�.");
//				
//			}
//		});
		
//		btnNo.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("�ƴϿ�, �Ⱦ��մϴ�.");
//			
//		}
//	});
		
		btnOk.addActionListener( e -> System.out.println("��, �����մϴ�.") );
		btnNo.addActionListener( e -> System.out.println("�ƴϿ�, �Ⱦ��մϴ�.") );
		
		this.add(lb);
		this.add(btnOk);
		this.add(btnNo);
		
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new LambdaEx3();

	}

}
