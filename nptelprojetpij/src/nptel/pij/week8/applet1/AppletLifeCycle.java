package nptel.pij.week8.applet1;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {
	StringBuffer stringBuffer;
	
	public void init(){
		stringBuffer=new StringBuffer();
		addItem("Initializing the applet");
		
	}
	
	public void start(){
		addItem("Starting the applet");
	}
	
	public void stop(){
		addItem("Stopping the applet");
	}
	public void destroy(){
		addItem("Destroying the applet");
	}
	
	
 void addItem(String word){
		System.out.println(word);
		stringBuffer.append(word);
		repaint();
	}
public void paint(Graphics g){
	//Draw an applet around the applet`s display area 
	g.drawRect(0, 0,getWidth()-1, getHeight()-1);
   //Display the string inside the rectangle 
	g.drawString(stringBuffer.toString(), 10, 20);
	
}
  
 //<applet code="AppletLifeCycle.class" width="300" height="200"></applet>
}
