package org.mku.core.java.test;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1=new Box();
		Box b2=new Box();
		
		b1.hieght=1;b1.breadth=2;b1.length=3;
		b2=b1;
		
		System.out.println(b2.hieght +" " + b2.length);
		
		
	}

}


class Box{
	
	int hieght;
	int breadth;
	int length;
}