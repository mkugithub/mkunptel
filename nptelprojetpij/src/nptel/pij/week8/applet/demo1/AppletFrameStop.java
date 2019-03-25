package nptel.pij.week8.applet.demo1; 
//the following program demonstrate the effect of stop() in an applet program
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="AppletFrame" width=300 height=50> </applet>*/

//Create a subclass of frame

class SampleFrame extends Frame{
	SampleFrame(String title){
		super(title);
	//Create an object to handle the window events
	MyWindowAdopter adopter=new MyWindowAdopter(this);
	//Register it to receive those events
	addWindowListener(adopter);
		
	}
	
	public void paint(Graphics g){
		g.drawString("This is an frame window", 10, 40);
	}
	
}

class MyWindowAdopter extends WindowAdapter{

	SampleFrame sampleFrame;
	public MyWindowAdopter(SampleFrame sampleFrame) {
	this.sampleFrame=sampleFrame;	
	}
	
	public void windowClosing(WindowEvent we){
		sampleFrame.setVisible(false);
	}
	
}

public class AppletFrameStop extends Applet {
	Frame f;
	public void init(){
		f=new SampleFrame("A frame window");
		f.setSize(250, 250);
		f.setVisible(true);
		
	}
	
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		g.drawString("This is an applet window", 10, 20);
	}
	
	
	

}
