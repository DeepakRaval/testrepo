package demo_2_classes;
// here v are passing argument having different data type 

//using Explicit promotion v can pass such value , put v got 
//deferent value due data lose

public class Explisit {

	public static void main(String[] arg) {

		double a = 87595088d;
		explisit((int)a);
		
		// this is another method to convert data type 
		byte b = (byte)a;
		Math.toIntExact(b);

		System.out.println("The value of a is " + b);

	}

	static void explisit(int a) {
		System.out.println("The value of a = " + a);
	}

}
