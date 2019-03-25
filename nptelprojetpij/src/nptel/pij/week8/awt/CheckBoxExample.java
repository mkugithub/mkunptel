package nptel.pij.week8.awt;

import java.awt.Checkbox;
import java.awt.Frame;

public class CheckBoxExample {
	
	CheckBoxExample(){
		Frame f=new Frame("CheckBox Example");
		Checkbox checkBox1=new Checkbox("C++");
		checkBox1.setBounds(100, 150, 50, 50);
		Checkbox checkBox2=new Checkbox("Java",true);
		checkBox2.setBounds(100, 150, 50, 50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
     
		 new CheckBoxExample();

	}

}
