package npet.pij.week3.demo;

//A variable declared inside a bracket are in a method has scope with the brackets only.
public class StaticRuleDemo_58 {

	public static void main(String []args){
		
		{
			//The variable x has scope within brackets
			int x=10;
			System.out.println(x);
			
		}
		//Uncommenting below line would produce compilation error since variable x is out of scope. 
		//System.out.println(x);
	}
	
	
}
