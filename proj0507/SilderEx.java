package proj0507;

import java.awt.*;
import javax.swing.*;

public class SilderEx extends JFrame {
	
	SilderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		this.add(slider);
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SilderEx();

	}

}
// 9주차 범위