package proj0409;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("EnglishAction")) {
			b.setText("한글액션");
		} else
			b.setText("EnglishAction");
	}

}
