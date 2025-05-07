package proj0507;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SilderChangeEx extends JFrame {
	
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider [3];
	
	SilderChangeEx() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		colorLabel = new JLabel(" =========SLIDER EXAMPLE========= ");
		
		for(int i = 0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			
			this.add(sl[i]);
		}
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		this.add(colorLabel);
		
		JButton btn = new JButton("확인");
		this.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int r = sl[0].getValue();
				int g = sl[1].getValue();
				int b = sl[2].getValue();
				colorLabel.setBackground(new Color(r, g, b));
			}
		});

		setSize(300,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SilderChangeEx();
	}
}
//9주차 범위