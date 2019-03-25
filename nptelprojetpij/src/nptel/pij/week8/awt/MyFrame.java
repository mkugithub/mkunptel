package nptel.pij.week8.awt;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame {

	public static void main(String[] args) {
		Frame frame=new Frame("Frame in Java");
		frame.resize(500, 500);
		frame.setBackground(Color.green);
		frame.show();
		frame.setVisible(true);

	}

}
