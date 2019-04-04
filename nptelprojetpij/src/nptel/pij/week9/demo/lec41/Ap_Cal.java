package nptel.pij.week9.demo.lec41;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ap_Cal extends Applet implements ActionListener{

	TextField one,two,res;
	Button add,sub,mul,div;
	public void init(){
		Label l1=new Label("First Number", Label.RIGHT);
		Label l2=new Label("Second Number", Label.RIGHT);
		Label l3=new Label("Reuslt", Label.RIGHT);
		one=new TextField(5);
		two=new TextField(5);
        res=new TextField(7);
		
		add=new Button("ADD");
		sub=new Button("SUB");
		mul=new Button("MULTI");
		div=new Button("DIV");
		
		add(l1);
		add(one);
		add(l2);
		add(two);
		add(l3);
		add(res);
		
		add(add);
		add(sub);
		add(mul);
		add(div);
		
		one.addActionListener(this);
		two.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
         String str=ae.getActionCommand();
         float b1,b2,b3=0;
         String msg;
         b1=Float.parseFloat(one.getText());
         b2=Float.parseFloat(two.getText());
		
         if(str.equals("ADD"))
            b3=b1+b2;
         if(str.equals("SUB"))
        	 b3=b1-b2;
         if(str.equals("DIV"))
        	 b3=b1/b2;
         if(str.equals("MULTI"))
        	 b3=b1*b2;

         msg=String.valueOf(b3);
         res.setText(msg);
         repaint();
	}

	public void paint(Graphics g){
		
	}
	
}

/*<applet code="Ap_Cal.class" width=460 hieght=500>
</applet>*/