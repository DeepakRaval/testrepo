package progrmaize_que;

public class Even_odd {

	public static void main(String[] args) {
		check_even_odd(10 % 3);

	}

	static void check_even_odd(int x) {
		if (x != 0) {
			System.out.println("This is ODD number");
		} else {
			System.out.println("This is EVEN numberj");
		}

	}

}
