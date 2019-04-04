package nptel.pij.week9.swing.demo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class ToogleButtonExample extends JFrame implements ItemListener {

	private JToggleButton button;
		
	public ToogleButtonExample() {
		
		setTitle("JToogleButton with Item Listenner");
		setLayout(new FlowLayout());
		setJToogleButton();
		setAction();
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
 private void	setJToogleButton(){
	 button=new JToggleButton();
	 add(button);
		
	}
 
  private void setAction(){
	 button.addItemListener(this);
 }
	
	
	
	public static void main(String[] args) {
		new ToogleButtonExample();

	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(button.isSelected()){
			button.setText("OFF");
		}
		else{
			button.setText("ON");
		}
		
	}

}
