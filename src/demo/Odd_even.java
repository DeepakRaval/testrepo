package demo;

public class Odd_even {

	public static void main(String[] args) {
		int num[] = new int[20];
		even(num);
		odd(num);
	}

	static void even(int[] x) {
		System.out.println("*** Even numbers are ***");
		int n = 1;
		for (int i = 0; i < x.length; i++) {
			x[i] = n;
			if (n % 2 == 0) {
				System.out.print(" "+x[i]);
			}
			n++;
		}
	}
	
	static void odd(int[]y){
		System.out.println("\n \n *** Odd numbers are ***");
		int n = 1;
		for (int i = 0; i < y.length; i++) {
			y[i] = n;
			if (n % 2 != 0) {
				System.out.print(" "+y[i]);
			}
			n++;
		}
	}
}
