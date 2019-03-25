package nptel.pij.week8.applet.demo1;

import java.applet.*;
import java.awt.*;

public class Sample extends Applet {

	String msg;
	//Set the foreground and background colors
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg="Inside the init()--";
	}
	
	//Initialized string to be displayed
	public void start(){
		msg+="Inside the start()--";
	}
	//Display msg in applet window
	public void paint(Graphics g){
		msg+="Inside the paint()--";
		g.drawString(msg, 10, 30);
	}
	
	
}
