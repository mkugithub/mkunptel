package nptel.pij.week9.swing.demo.xvi;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scribble2 extends Applet{
	
	private int last_x,last_y;
	//mouse position
	private Color current_color=Color.black;//Store the color
	
	private Button clear_button;
	private Choice color_choice;
	
	//This method is called to initialized the applet
	//Applet don`t have a main method
	public void init(){
		//Set the backgroud color
		this.setBackground(Color.white);
		//Create a button and add to the applet and set color_button
		clear_button=new Button("Clear");
		clear_button.setForeground(Color.black);
		clear_button.setBackground(Color.lightGray);
		this.add(clear_button);
		
		//Create a menu of the color and add it to the applet
		//Also set the menu`s colors and add a label
		color_choice=new Choice();
		color_choice.addItem("black");
		color_choice.addItem("red");
		color_choice.addItem("yellow");
		color_choice.addItem("green");
		color_choice.setForeground(Color.black);
		color_choice.setBackground(Color.lightGray);
		this.add(new Label("Color :"));
		this.add(color_choice);
		
	}
	
	//This method is called when the user click the mouse to strat scrible
	public boolean mouseDown(Event e, int x, int y){
		last_x=x;last_y=y;
		return true;
	}
	
	
	public boolean mouseDragged(Event e, int x, int y) {
		Graphics g=this.getGraphics();
	  g.setColor(current_color);
	    g.drawLine(last_x, last_y, x, y);
	    last_x=x;last_y=y;
	    return true;
	}
	

}
