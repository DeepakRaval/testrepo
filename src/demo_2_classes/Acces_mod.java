package demo_2_classes;

/*Default – No keyword required
Private
Protected
Public   ------------------ these are the access modifire of java
*/
public class Acces_mod {
     private static int i = 45;
     
     protected String name = "Deepak Raval";

	public static void main(String[] args) {
		System.out.println(getI());
//		Acces_mod a1 = new Acces_mod(20);
//		System.out.println(a1.i);
		Acces_mod.setI(98);
		System.out.println(getI());
		print();
	}
	
	static void print(){
//		Acces_mod a2 = new Acces_mod(30);
//		System.out.println(a2.i);
		Acces_mod.setI(87);
		System.out.println(getI());
	}

	public static int getI() {
		return i;
	}

public static void setI(int i) {			
		Acces_mod.i = i;
	}

}
