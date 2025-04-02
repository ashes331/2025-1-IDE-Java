package proj0402;

import java.awt.*;
import javax.swing.*;

public class Ex9_4 extends JFrame {
	
	Ex9_4() {
		this.setTitle("BorderLatout Sample");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout(30, 20));
		this.add(new JButton("Calculate"), BorderLayout.CENTER);
		this.add(new JButton("add"), BorderLayout.NORTH);
		this.add(new JButton("sub"), BorderLayout.SOUTH);
		this.add(new JButton("mul"), BorderLayout.EAST);
		this.add(new JButton("div"), BorderLayout.WEST);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Ex9_4();

	}

}
