package proj0430;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JComboBoxEx extends JFrame {
	
	JComboBoxEx() {
		setTitle("JComboBox ¿¹Á¦");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		String[] fruits= {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		this.add(strCombo);
		
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(strCombo.getSelectedIndex() + ", " +
						strCombo.getSelectedItem().toString());
			}
		});
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBoxEx();

	}

}
