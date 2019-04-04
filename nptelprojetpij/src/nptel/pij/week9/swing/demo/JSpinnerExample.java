package nptel.pij.week9.swing.demo;

import javax.swing.*;

public class JSpinnerExample {

	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		SpinnerModel value=new SpinnerNumberModel(
				5,//initial value 
				0,//minimum value
				10,//maximum value
				1);
		JSpinner spinner=new JSpinner(value);
		spinner.setBounds(100, 100,50,30);
		f.add(spinner);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
