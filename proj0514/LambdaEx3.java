package proj0514;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LambdaEx3 extends JFrame {
	
	LambdaEx3() {
		this.setTitle("람다식 적용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JLabel lb = new JLabel("아이스크림을 좋아하나요?");
		JButton btnOk = new JButton("Yes");
		JButton btnNo = new JButton("No");
		
//		btnOk.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("네, 좋아합니다.");
//				
//			}
//		});
		
//		btnNo.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("아니요, 싫어합니다.");
//			
//		}
//	});
		
		btnOk.addActionListener( e -> System.out.println("네, 좋아합니다.") );
		btnNo.addActionListener( e -> System.out.println("아니요, 싫어합니다.") );
		
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
