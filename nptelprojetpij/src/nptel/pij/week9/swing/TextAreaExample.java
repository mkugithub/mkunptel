package nptel.pij.week9.swing;

import javax.swing.*;

public class TextAreaExample {
	
	public TextAreaExample() {
	
		JFrame f=new JFrame();
		JTextArea area=new JTextArea("Welcome to IIT Kharagpur");
		area.setBounds(10, 30, 200, 200);
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		 new TextAreaExample();
      
	}

}
