package proj0430;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JCheckBoxEx extends JFrame{
	
	private String[]      names = {"사과", "배", "체리"};
	private int[]         prices = {100, 500, 20000};
	int sum = 0;		
	
	JCheckBoxEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		JLabel sumLabel = new JLabel("현재 0원 입니다.");
		JCheckBox cbApple = new JCheckBox("사과");
		JCheckBox cbPeer = new JCheckBox("배");
		JCheckBox cbCherry = new JCheckBox("체리");
		
		//사과
		cbApple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cbApple.isSelected())
					sum += prices[0];
				else
					sum -= prices[0];
				sumLabel.setText("현재 " + sum + "원 입니다.");
				
			}
		});
		
		//배
		cbPeer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cbPeer.isSelected())
					sum += prices[1];
				else
					sum -= prices[1];
				sumLabel.setText("현재 " + sum + "원 입니다.");
			}
		});
		
		//체리
		cbCherry.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cbCherry.isSelected())
					sum += prices[2];
				else
					sum -= prices[2];
				sumLabel.setText("현재 " + sum + "원 입니다.");
				
			}
		});
		
		this.add(cbApple);
		this.add(cbPeer);
		this.add(cbCherry);
		this.add(sumLabel);
		
		this.setSize(250, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		new JCheckBoxEx();

	}
}
