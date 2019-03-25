package nptel.pij.week8.awt;
import java.awt.*;

public class ButtonDemo extends Frame {
	
	 public ButtonDemo(){
		Button b=new Button("Click");
		b.setBounds(30, 100, 80,30);//Setting the button position
		
		add(b);//add the button to the frame
		setSize(300,300);//frame size with 300 width and hieght
		setLayout(null);//no layout manager
		setVisible(true);//Make the frame visible
		
	   }

	public static void main(String[] args) {
		 ButtonDemo b=new ButtonDemo();
		 
  
	}

}
