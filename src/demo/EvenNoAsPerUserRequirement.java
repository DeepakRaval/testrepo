package demo;

public class EvenNoAsPerUserRequirement {

	public static void main(String[] args) {
		
		formArray(20);

	}
	
	static void formArray(int a) {
		int n = 1;
		int[] number = new int[a*2];
		for (int i = 0; i < number.length; i++) {
			number[i] = n;
			n++;
		}
		evenNum(number);
	}

	static void evenNum(int[] a) {
		System.out.println("The Even numbers are:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

	}
}
