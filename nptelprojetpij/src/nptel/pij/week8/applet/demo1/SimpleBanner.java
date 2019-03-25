package nptel.pij.week8.applet.demo1;
import java.applet.*;
import java.awt.*;


public class SimpleBanner extends Applet implements Runnable {

	String msg="A simple Moving Banner";
	Thread t=null;
	int state;
	boolean stopFlag;
	//Set the color and initialized the thread.
	
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		
	}
	
	public void start(){
		t=new Thread(this);
		stopFlag=false;
		t.start();
	}
// Entry point of thread that runs the banner
	
	@Override
	public void run() {
		char ch;
		//Display the banner
		for(; ;){
			try{
				repaint();
				Thread.sleep(250);
				ch=msg.charAt(0);
				msg=msg.substring(1, msg.length());
				msg+=ch;
				if(stopFlag){
				break;	
				}
			}	
			catch(InterruptedException e){}
		}
	}

	public void stop(){
		stopFlag=true;
		t=null;
	}
	
	//Display the banner
	public void paint(Graphics g){
		g.drawString(msg, 50, 30);
	}
	
}
