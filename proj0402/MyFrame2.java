package proj0402;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	// ������, 4���� �׻� ���� ����
	MyFrame2() {
		this.setTitle("���� ù GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		// MyFrame2 frame = new MyFrame2();
		new MyFrame2();
		
		

	}

}
