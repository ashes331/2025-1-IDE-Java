package proj0409;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClass extends JFrame{
	// ������
	IndepClass() {
		this.setTitle("Action �̺�Ʈ ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btnOk = new JButton("EnglishAction");
		this.setLayout(new FlowLayout());
		this.add(btnOk);
		
		
		MyAction mylistener = new MyAction();
		btnOk.addActionListener(mylistener);
		
		this.setSize(350, 200);
		this.setVisible(true);
	}

	// ���⿡ inclass �� ����Ͽ� MyAction�ڵ带 �־ ��
	
	public static void main(String[] args) {
		
		new IndepClass();
	}

}
