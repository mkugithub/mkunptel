package npet.pij.week3.demo;

public class StaticRuleForLoopDemo_59 {
	 
	public static void main(String [] args){
		for(int x=0;x<4;x++){
			System.out.println(x);
			
		}
		//Scope of this variable x is within the for loop only
		//System.out.println(x);
	}

}
