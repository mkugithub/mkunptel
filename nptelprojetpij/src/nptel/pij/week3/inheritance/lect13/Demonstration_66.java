package nptel.pij.week3.inheritance.lect13;

class Cat{
	void speak()
	{
		System.out.println("Meon !!!!");
	}
}

class PetCat extends Cat{
	 void speak(){
		 System.out.println("Pet cat speaking meaow !!");
	 }
	 
}
class MagicCat extends Cat{
	  boolean noOne;
	 
	 void speak(){
		 if(noOne){
			 super.speak();// will call the super class cat speak
		 }
		 else
		 {
			 System.out.println("Magic cat is speaking meaowing");
		 }
	 }
	
}

public class Demonstration_66 {

	public static void main(String[] args) {
		PetCat c1=new PetCat();
		MagicCat c2=new MagicCat();
		c2.noOne=true;
        c2.speak();
        c1.speak();
        
        c2.noOne=false;
        c2.speak();
        c1.speak();
		

	}

}
