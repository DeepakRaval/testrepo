package demo;

//import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] n = { 2, 1, 3, 8, 6, 5, 7 };
//		Arrays.sort(n);
//		printArray(n);
		sortByMethod(n);
		int[] finalResult = accendind(n);
		printArray(finalResult);
	}

	static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	static int[] accendind(int x[]) {
		int temp = 0;
		int[] res = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			res[i] = x[i];

		}
		return res;
	}
	
	static void sortByMethod(int [] x){
		
	}
}
