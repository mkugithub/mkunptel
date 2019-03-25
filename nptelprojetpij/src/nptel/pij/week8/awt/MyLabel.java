package nptel.pij.week8.awt;

import java.awt.Frame;
import java.awt.Label;

public class MyLabel {

	public static void main(String[] args) {
		Frame frame=new Frame("Lable Example");
		Label l1,l2;
		l1=new Label("First Label");
		l1.setBounds(20, 80, 100, 30);
		l2=new Label("Second Lebel");
		l2.setBounds(50, 100, 100, 30);
		frame.add(l1);
		frame.add(l2);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}

}
