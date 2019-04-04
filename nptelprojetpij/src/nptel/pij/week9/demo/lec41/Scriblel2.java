package nptel.pij.week9.demo.lec41;

import java.applet.*;
import java.awt.*;

public class Scriblel2  extends Applet{
   private int last_x,last_y;            //Store the last mouse position
   private Color current_color=Color.black; //Store the current color
   private Button clear_button; //Clear the button
   private Choice color_choice;  //the color dropdwon list
	
   //This method is called to initialize the applet
    public void init(){
    	this.setBackground(Color.white);
    	clear_button=new Button("Clear");
    	clear_button.setForeground(Color.black);
    	clear_button.setBackground(Color.lightGray);
    	this.add(clear_button);
    //Create the menu of colors and add to it to the applet
    //Also set the menu`s colors and add a label
    color_choice=new Choice();
    color_choice.addItem("black");
    color_choice.addItem("red");
    color_choice.addItem("green");
    color_choice.addItem("yellow");
    
    color_choice.setForeground(Color.black);
    color_choice.setBackground(Color.lightGray);
    this.add(new Label("Color: "));
    this.add(color_choice);
    	
    }
   
   
   
	
}
