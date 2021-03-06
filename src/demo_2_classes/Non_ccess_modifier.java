package demo_2_classes;
/*static
final
abstract
transient
volatile
strictfp
the all mentioned are the non access modifier*/
public class Non_ccess_modifier {
	String name;
	 final int i;
	 
	
	
	public Non_ccess_modifier(int i) {
		super();
		this.i = i;
	}


	public Non_ccess_modifier(String name, int i) {
		super();
		this.name = name;
		this.i = i;
	}


	public static void main(String[]args){
		final int i = 20;
//		i = i + 12; // here due to final non access modifier i is not able to change
		System.out.println(i);
		
		final String name = "Deepak";
		System.out.println("Name is: "+name);
//		name = name +"pqr"; //  the same problem occurs as above, cant change value of String name .
		System.out.println("name with final value: "+name);
		
//		values are getting changed after passing it second time with constructor
		Non_ccess_modifier a1 = new Non_ccess_modifier(10);
		System.out.println("The value of final int = "+a1.i);
		
		Non_ccess_modifier a2 = new Non_ccess_modifier(12);
		System.out.println("The value of Final int variable = "+a2.i);
		
		Non_ccess_modifier a5 = new Non_ccess_modifier("xyz", 87);
		System.out.println(a5.i + a5.name);
		
		// In case of Object after using final key word values can be changed
		// but reference remains the same 		
		final Non_ccess_modifier a3 = new Non_ccess_modifier(i);
		a3.name = "deepak";
		a3.name = "raval";
		System.out.println("\n Name is: "+a3.name);
		
//		arrays also can be changed with final key word
		final String [] name1 = {"this ","is ","Progrming ","Wings"}; 
		int lenth = name.length();
		System.out.println("Value of string *before* = "+name1[2]);
		name1[2] = "Java";
		System.out.println("Value of string *after* = "+name1[2]);
		System.out.println("Lenth of array is "+lenth);
	}

}
