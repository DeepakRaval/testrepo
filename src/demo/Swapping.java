package demo;

// swapping of numbers without using third variable 

public class Swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a= "+a+" b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		b=a-b;
		System.out.println("a= "+a+" b= "+b);
			
	}

}
