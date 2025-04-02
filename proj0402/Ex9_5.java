package proj0402;

import javax.swing.*;
import java.awt.*;

public class Ex9_5 extends JFrame {
	
	Ex9_5() {
		this.setTitle("GridLayout Sample");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// this.setLayout(new GridLayout(4, 2));
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		this.setLayout(grid);
		this.add(new JLabel(" 이름"));
		this.add(new JTextField(""));
		this.add(new JLabel(" 학번"));
		this.add(new JTextField(""));
		this.add(new JLabel(" 학과"));
		this.add(new JTextField(""));
		this.add(new JLabel(" 과목"));
		this.add(new JTextField(""));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Ex9_5();

	}

}
