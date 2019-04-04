package nptel.pij.week9.swing;

import javax.swing.*;

public class ButtonExampleWithImage {

	ButtonExampleWithImage(){
		
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton(new ImageIcon("D:\\icone.png"));
		b.setBounds(50, 100, 95, 30);
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String [] args){
		new ButtonExampleWithImage();
	}
}
