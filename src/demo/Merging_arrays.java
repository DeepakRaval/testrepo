package demo;

import java.util.Arrays;

public class Merging_arrays {

	public static void main(String[] args) {

		String s = "HELLOWORLD";
		char[] c1 = s.toCharArray();
		System.out.println(Arrays.toString(c1));
		char[] c2 = Arrays.copyOfRange(c1, 0, 5);
		
System.out.println("** After replacing **");
		
		String s1 = "JAVAA";
		char[] c3 = s1.toCharArray();
		
		int l = c2.length + c3.length;
		char[] result = new char[l];
		// Acutely this will not merge arrays into the resultant array
		// this method copies the required amount of elements from the source array
		
		System.arraycopy(c2, 0, result, 0, c2.length);
//		(srcArray, indexOfsrcATobeCopiedFrom, destArray, idxOfdestAWhrTobePast, idxOfSrcAUptoCpy)
		System.arraycopy(c3, 0, result, c2.length, c3.length);
		System.out.println(Arrays.toString(result));
		
		StringBuilder g = new StringBuilder();
		System.out.println(g.append(result));
		
		

	}
}
/*This method is used to copy desired  element of  array from the source array to another destination 
 * array.
 * 
 * System.arraycopy( srcArray, e1, destArray, e2, e3);
 * 
 *  here:
 *  srcArray:- this is source array from which element to be copied.
 *  e1 :- this is index (position) of source array from which element will be copied
 *  destArray:- this is destination array where copied elements will be pasted.
 *  e2:- This is Position (index) of destination array from which element will start pasting
 *  e3:- This is position of source array up to which element to be copied.
 * */
 