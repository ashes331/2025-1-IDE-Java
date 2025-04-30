package proj0430;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JCheckBoxEx extends JFrame{
	
	private String[]      names = {"���", "��", "ü��"};
	private int[]         prices = {100, 500, 20000};
	int sum = 0;		
	
	JCheckBoxEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		JLabel sumLabel = new JLabel("���� 0�� �Դϴ�.");
		JCheckBox cbApple = new JCheckBox("���");
		JCheckBox cbPeer = new JCheckBox("��");
		JCheckBox cbCherry = new JCheckBox("ü��");
		
		//���
		cbApple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cbApple.isSelected())
					sum += prices[0];
				else
					sum -= prices[0];
				sumLabel.setText("���� " + sum + "�� �Դϴ�.");
				
			}
		});
		
		//��
		cbPeer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cbPeer.isSelected())
					sum += prices[1];
				else
					sum -= prices[1];
				sumLabel.setText("���� " + sum + "�� �Դϴ�.");
			}
		});
		
		//ü��
		cbCherry.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cbCherry.isSelected())
					sum += prices[2];
				else
					sum -= prices[2];
				sumLabel.setText("���� " + sum + "�� �Դϴ�.");
				
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
