package proj0430;

import java.awt.FlowLayout;
import javax.swing.*;

public class JLabelEx extends JFrame {
	
	JLabelEx() {
		this.setTitle("JComeponent의 공통 메소드 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JLabel txtLabel = new JLabel("사랑합니다. 여러분~! Good Day!");
		ImageIcon image = new ImageIcon("C:\\Users\\313\\image\\love.jpg");
		JLabel imgLabel = new JLabel(image);
		ImageIcon imgPhone = new ImageIcon("C:\\Users\\313\\image\\call.jpg");
		JButton btn = new JButton("따르릉~!", imgPhone);
		
		this.add(txtLabel);
		this.add(imgLabel);
		this.add(btn);
		
		this.setSize(400, 600);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelEx();

	}
}
