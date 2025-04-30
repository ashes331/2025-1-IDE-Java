package proj0430;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JTextAreaEx extends JFrame {
	
	JTextAreaEx() {
		setTitle("JTextArea 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(7, 20);
		
		this.add(tf);
		this.add(ta);
		
		tf.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
		

		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaEx();

	}

}
