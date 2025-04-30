package proj0430;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
	
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"사과", "배", "체리"};
	private ImageIcon [] image = {
			new ImageIcon("C:\\Users\\313\\image\\apple.jfif"),
			new ImageIcon("C:\\Users\\313\\image\\peer.jfif"),
			new ImageIcon("C:\\Users\\313\\image\\cherry.jfif")};
	private JLabel imageLabel = new JLabel();
	
	RadioButtonEx() { 
		setTitle("라디오버튼 액션이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel radioPanel = new JPanel(); //기본이 FlowLayout
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup btngroup = new ButtonGroup();
		for (int i=0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			btngroup.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (radio[0].isSelected() == true)
						imageLabel.setIcon(image[0]);
					else if (radio[1].isSelected())
						imageLabel.setIcon(image[1]);
					else 
						imageLabel.setIcon(image[2]);
				}
			});
		}
		
		radio[2].setSelected(true);
		imageLabel.setIcon(image[2]);
		
		this.add(radioPanel, BorderLayout.NORTH);
		this.add(imageLabel, BorderLayout.CENTER);
		
		this.setSize(300, 350);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();

	}
}
