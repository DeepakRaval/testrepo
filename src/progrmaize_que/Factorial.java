package progrmaize_que;
/*
 * Factorial:
 * for example - 
 * factorial = 5 = 1x2x3x4x5
 * 
 * */

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		factorial(n);
	}
	
	static void factorial(int a){
		int fact = 1;
		for (int i = 1; i <= a ; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
