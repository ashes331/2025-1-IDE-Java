package proj0430;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JCompEx extends JFrame {
	
	JCompEx() {
		this.setTitle("JComeponent�� ���� �޼ҵ� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pan1 = new JPanel(); //FlowLayout �⺻
		JButton btn1 = new JButton("���ڻ�/���� ���� ��ư");
		JButton btn2 = new JButton("�� ��Ȱ��ȭ(enable) ���� ��ư");
		JButton btn3 = new JButton("x, y ��ǥ �˾Ƴ��� ��ư");
		
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA);
		btn2.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(btn3.getX() + ", " + btn3.getY());
			}
		});
	
		this.add(pan1);
		
		this.setSize(250, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCompEx();

	}
}
