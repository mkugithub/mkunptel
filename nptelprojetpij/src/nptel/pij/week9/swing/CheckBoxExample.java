package nptel.pij.week9.swing;
import javax.swing.*;


public class CheckBoxExample {
	
	public CheckBoxExample() {
		JFrame f=new JFrame("Check Box Example");
		JCheckBox b1=new JCheckBox("C++");
		   b1.setBounds(100, 100, 50, 50);
		JCheckBox b2=new JCheckBox("Java");
            b2.setBounds(100, 150, 50, 50);
            f.add(b2);
            f.add(b1);
            f.setSize(400, 400);
            f.setLayout(null);
            f.setVisible(true);
	}
	
	
	

	public static void main(String[] args) {
		new CheckBoxExample();
	}

}
