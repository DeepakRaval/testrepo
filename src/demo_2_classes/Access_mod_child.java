package demo_2_classes;

// private key word is accessible only in scope of class. but this is readable in child class 
// v cant make changes in private variables from out of the class.

public class Access_mod_child {
	public static void main(String[] args) {
		Acces_mod.print();
		// Acces_mod.i = 837;// this is not possible with private key word.

		// but with the use of geter and seter v can initialize private
		// variable from other class
		Acces_mod.setI(91);
		System.out.println(Acces_mod.getI());
		
	//	System.out.println(Acces_mod.i);// Not visible in another class as having a private key word.
		
	// // in case of 'protected variable' this is accessible from 'sub classes' of same packages // // 	
		Acces_mod a2 = new Acces_mod();
		a2.name = "Raval Deepak";
		System.out.println(a2.name);
	}

}
