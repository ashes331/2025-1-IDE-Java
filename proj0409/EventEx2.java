package proj0409;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EventEx2 extends JFrame {
	EventEx2() {
		this.setTitle("레이블 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("기본 텍스트");
		JButton button1 = new JButton("안녕!");
		JButton button2 = new JButton("잘가!");
		
		this.setLayout(new GridLayout(3, 1)); 
		this.add(label);
		this.add(button1);
		this.add(button2);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("안녕하세요. 반가워요~!");
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("안녕히가세요. 또 봐요~!");
			}
		});
		
		this.setSize(400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new EventEx2();
	}

}
