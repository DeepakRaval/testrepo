package progrmaize_que;

public class Fibonacci_series {

	public static void main(String[] args) {
		int term_1 = 0, term_2 = 1;
		int n = 5;
		System.out.println("0");
		for (int i = 0; i < n; i++) {
			int sum = term_1 + term_2;
			term_1 = term_2;
			term_2 = sum;
			System.out.println(sum);

		}

	}

}
