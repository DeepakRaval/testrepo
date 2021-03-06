package demo;

import java.util.Arrays;

public class TimePass {
	public static void main(String[]args){
	
		String s1 = "Hello ";
		char [] c1 = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		String s2 = "World";
		char [] c2 = s2.toCharArray();
		
		int l = c1.length + c2.length;
		char [] result = new char[l];
		
		for (int i = 0; i < 5; i++) {
			result[i] = c1[i];
		}
		System.out.println(Arrays.toString(result));
		
		int j = 5;
		int n = 0;
		
				do{
					result[j]=c2[n];
					n++;
					j++;
				}while(j<(result.length - 1));
			
		System.out.println(Arrays.toString(result));
	
}
}
