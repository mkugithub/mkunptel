package nptel.pij.week9.swing;
import javax.swing.*;


public class ComboBoxExample {
	JFrame f;
	
	public ComboBoxExample() {
	  f=new JFrame("Combox Example");
	  String country[]={"Inida","Australia","U.S.A","England","Newzealand"};
	  JComboBox cb=new JComboBox(country);
	  cb.setBounds(50, 50, 90, 20);
	  f.add(cb);
	  f.setSize(400, 400);
	  f.setLayout(null);
	  f.setVisible(true);
	 	
	}
	
	
	
	

	public static void main(String[] args) {
		
   new ComboBoxExample();
	}

}
