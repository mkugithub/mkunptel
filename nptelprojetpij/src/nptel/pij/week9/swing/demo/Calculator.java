package nptel.pij.week9.swing.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//Java program to create a simple calcultor with basic +,-,/* using java swing element
public class Calculator extends JFrame implements ActionListener{
	//Create a frame
	 static JFrame f;
	//Create a text field
	static JTextField t;
	//Store and operator and operand
	String s0,s1,s2;
	//Default constructor
	Calculator(){
	s0=s1=s2="";
	}
	
//main function 
	public static void main(String []args){
		f=new JFrame("Swing Calculator");
		
		try{
			//Set look and feel 
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		//Create a object of the class
		Calculator c=new Calculator();
		//Create a text field
		t=new JTextField(16);
		//set text fields to non editable
		t.setEditable(false);
		//Create a number buttons and some operator
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bd,bm,be,beq,beql;
		//Create number buttons
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		//Equal button
		beql=new JButton("=");
		
		//Create operator buttons
		ba=new JButton("+");
		bs=new JButton("-");
		bd=new JButton("/");
		bm=new JButton("*");
		beq=new JButton("C");
		
		//Create . button
		be=new JButton(".");
		//Create a panel
		JPanel p=new JPanel();
		
		
		//add action listeners
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
		b9.addActionListener(c);
		
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beql.addActionListener(c);
		
		//add elements to panel
		p.add(t);
		p.add(ba);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b0);
		p.add(be);
		p.add(beql);
		p.add(bm);
		p.add(ba);
		p.add(bs);
		p.add(bd);
		
		//p.setBounds(40, 80, 200, 200);
		p.setBackground(Color.blue);
		
		
		f.add(p);
		
		f.setSize(200, 200);
		//f.setLayout(new BorderLayout());
		//f.setVisible(true);
		f.show();
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		//if the value is number
		if(s.charAt(0)>='0'&& s.charAt(0)<='9'|| s.charAt(0)=='.'){
			//if operand is present then add to 2nd number
			if(!s1.equals("")){
				s2=s2+s;
			}
			else{
				s0=s0+s;
			//Set the value of text
			 t.setText(s0+s1+s2);	
			}
		}
		else if(s.charAt(0)=='='){
			double te=0.0;
			//store the value in lst
			if(s1.equals("+"))
				te=(Double.parseDouble(s0)+Double.parseDouble(s2));
			else if(s1.equals("-"))
				te=(Double.parseDouble(s0)-Double.parseDouble(s2));
			else if(s1.equals("/"))
				te=(Double.parseDouble(s0)/Double.parseDouble(s2));
			else if(s1.equals("*"))
				te=(Double.parseDouble(s0)*Double.parseDouble(s2));
			//Convert it to string	
			s0=Double.toString(te);
			//Place the operator
			s1=s;
			//Make the operand black
			s2="";
			//Set the value of the text
			t.setText(s0+s1+s2);
		}
		
		
		
	}

}
