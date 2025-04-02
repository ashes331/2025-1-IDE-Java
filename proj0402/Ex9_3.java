package proj0402;

import java.awt.*;
import javax.swing.*;

public class Ex9_3 extends JFrame {
	// »ý¼ºÀÚ
	public Ex9_3() {
		this.setTitle("FlowLayout Sample");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		this.add(new JButton("add"));
		this.add(new JButton("sub"));
		this.add(new JButton("mul"));
		this.add(new JButton("div"));
		this.add(new JButton("Calculate"));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Ex9_3();

	}

}
