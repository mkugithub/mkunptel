package nptel.pij.week8.applet1;
import java.applet.*;
import java.awt.*;

public class Sample extends Applet {
    String msg;
    //Set the foregroud and backgroud colors
    
    public void init(){
    setBackground(Color.cyan);
    setForeground(Color.red);
    msg+="Inside init() --";
    
    }
 //Initiallize the strinig to be displayed
    public void start(){
    	msg+="insdide the start()";
    }
    
    
// Display msg in applet window
    public void paint(Graphics g){
    	msg+="Inside the paint";
    	g.drawString(msg, 10,30);
    }
    
	
	
}
