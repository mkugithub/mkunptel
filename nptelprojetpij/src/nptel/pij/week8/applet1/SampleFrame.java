package nptel.pij.week8.applet1;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter{
	SampleFrame sampleFrame;
	public MyWindowAdapter(SampleFrame sampleFrame){
		this.sampleFrame=sampleFrame;
	}
	
	public void windowClosing(WindowEvent we ){
        sampleFrame.setVisible(false);		
	}
	
}

class AppletFrame extends Applet{
	Frame f;
	public void init(){
		f=new SampleFrame("A frame window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
      	}
   public void stop(){
	   f.setVisible(false);
     }
  public void paint(Graphics g){
	  g.drawString("This is in applet window", 10, 20);
    }
	
}

//Create a child frame window from within an applet
public class SampleFrame extends Frame {

	SampleFrame(String title){
		super(title);
		//Create an object to handle window events
		MyWindowAdapter adopter=new MyWindowAdapter(this);//Register it to receive those events
		addWindowListener(adopter);
	}
	
	
	public void paint(Graphics g){
		g.drawString("This is in frame windoe", 10, 40);
	}

	
	
}
