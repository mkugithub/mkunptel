package nptel.pij.week8.awt;
import java.awt.*;
import java.applet.*;

public class EventDemo extends Applet {
	static final int n=4;
	Label label;
	public void init(){
		setLayout(new GridLayout(n, n));
		setFont(new Font("Helvetica", Font.BOLD, 24));
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int k=i*n+j+1;
				if(k<16){
					add(new Button(" "+k+1));
				}
			}
		}
		
		label=new Label(".", Label.CENTER);
		label.setFont(new Font("Times Roman",Font.ITALIC,24));
		add(label);
	}
	
	//Overridden event handler
	
	public boolean action(Event e, Object obj){
		//Wait for click a button object	
		if(e.target instanceof Button){
			//Print the value of click button
			label.setText((String)obj);
		}
		return false;
	}
  
	
}
