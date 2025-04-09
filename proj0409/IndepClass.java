package proj0409;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClass extends JFrame{
	// 생성자
	IndepClass() {
		this.setTitle("Action 이벤트 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btnOk = new JButton("EnglishAction");
		this.setLayout(new FlowLayout());
		this.add(btnOk);
		
		
		MyAction mylistener = new MyAction();
		btnOk.addActionListener(mylistener);
		
		this.setSize(350, 200);
		this.setVisible(true);
	}

	// 여기에 inclass 를 사용하여 MyAction코드를 넣어도 됨
	
	public static void main(String[] args) {
		
		new IndepClass();
	}

}
