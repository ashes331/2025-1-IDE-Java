package proj0409;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventEx1 extends JFrame {
	
	// 생성자
	EventEx1() {
		this.setTitle("버튼 이벤트 예제1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JButton btnOk = new JButton("확인");
		JButton btnCancel = new JButton("취소");
		
		this.setLayout(new FlowLayout());
		this.add(btnOk);
		this.add(btnCancel);
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(e);
				System.out.println("확인 버튼 클릭함!");
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(e);
				System.out.println("취소 버튼 클릭함!");
			}
		});
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new EventEx1();
	}
}
