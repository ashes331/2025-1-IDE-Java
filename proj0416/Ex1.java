package proj0416;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1 extends JFrame {
	
	Ex1() {
		this.setTitle("판넬예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JLabel Lab = new JLabel("아이스크림을 좋아하나요?? ");
		
		JButton btnYes = new JButton("Yes");
		JButton btnNo = new JButton("No");
		
		this.add(Lab);
		this.add(btnYes);
		this.add(btnNo);
		
		btnYes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("예, 아이스크림을 좋아합니다.");
			}
		});
		
		btnNo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("아니오, 아이스크림을 좋아하지 않습니다.");
			}
		});
		
		this.setSize(300, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Ex1();
	}
}
