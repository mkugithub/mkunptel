package nptel.pij.week4.lect18.mypackage1;

public class Y extends X {
	
	Y(){
		System.out.println("I am constructor from class Y:");
		System.out.println("n " +n);
		//Error p is private member of X. Not accessible outside X
		//System.out.println("p " +p);
		System.out.println("q " +q);//protectd q is accessible
		System.out.println("r " +r);// r is also accessible as it is public
	}

}
