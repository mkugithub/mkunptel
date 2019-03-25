package nptel.pij.week8.applet.demo1;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletCalculator extends Applet implements ActionListener {

	String msg=" ";
	int v1,v2, result;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,multi, div,clear,mod,EQ;
	char op;
	public void init(){
		Color k=new Color(120,89,90);
		setBackground(k);
		t1=new TextField(10);
		GridLayout gl=new GridLayout(2,0);
		setLayout(gl);
		add(t1);
		for(int i=0;i<10;i++){
			b[i]=new Button(" "+i);
		}
		add=new Button("+");
		sub=new Button("-");
		multi=new Button("*");
		div=new Button("/");
		clear=new Button("CLEAR");
		mod=new Button("%");
		EQ=new Button("=");
		
		t1.addActionListener(this);
		for(int i=0;i<10;i++){
			add(b[i]);
		}
		add(add);
		add(sub);
		add(multi);
		add(div);
		add(clear);
		add(mod);
		add(EQ);
		for(int i=0; i<10;i++){
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		multi.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		mod.addActionListener(this);
		EQ.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		char ch=str.charAt(0);
		if(Character.isDigit(ch))
			t1.setText(t1.getText()+str);
		else
			if(str.equals("+")){
				v1=Integer.parseInt(t1.getText());
				op='+';
				t1.setText("");
			}
			else if(str.equals("-")){
				v1=Integer.parseInt(t1.getText());
				op='-';
				t1.setText("");
			}
			else if(str.equals("*")){
				v1=Integer.parseInt(t1.getText());
				op='*';
				t1.setText("");
			}
			else if(str.equals("/")){
				v1=Integer.parseInt(t1.getText());
				op='/';
				t1.setText("");
			}
			else if(str.equals("%")){
				v1=Integer.parseInt(t1.getText());
				op='%';
				t1.setText("");
			}
			else if(str.equals("=")){
				v2=Integer.parseInt(t1.getText());
				
				if(op=='+')
					result=v1+v2;
				else if(op=='-')
					result=v1-v2;
				else if(op=='*')
					result=v1*v2;
				else if(op=='/')
					result=v1/v2;
				else if(op=='%')
					result=v1%v2;
				t1.setText(""+result);
			}
		
		if(str.equals("CLEAR"))
			t1.setText("");
	}

	
	
}
