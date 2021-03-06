package demo;

import java.util.Scanner;

public class AdditonUpToGivenNo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a = s.nextInt();
		formArray(a);

	}


	static void formArray(int a) {
		int n = 1;
		int[] number = new int[a];
		for (int i = 0; i < number.length; i++) {
			number[i] = n;
			n++;
		}

//		evenNum(number);
		additon(number);
	}
	
	static void additon(int []a) {
		int[] number = new int[a.length];
		int n = 0;
		for (int i = 0; i < number.length; i++) {
			n = n + a[i];
		}
		System.out.println("The addition up to given number is : " + n);
	}
/*
	static void evenNum(int[] a) {
		System.out.println("The Even numbers are:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}*/
}
