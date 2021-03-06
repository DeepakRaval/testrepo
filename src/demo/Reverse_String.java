package demo;


public class Reverse_String {

	public static void main(String[]args){
		
	// string reversing using reverse method of stringBuffer 
		String test = "deepak";
		System.out.println("Original string= "+test);
		StringBuffer check = new StringBuffer(test);
		check.reverse();
		System.out.println("Reversed string by *Reverse method*= "+check);
		
		
		//reversing string by logical method
		String finalString = reverseString(test);
		System.out.println("Reversed string *Using logic*= "+finalString);
		
	}
	
	static String reverseString(String test){
		
		int length = test.length();
		
		char [] charArray = new char[length];
		charArray = test.toCharArray();
		
		char [] resultArray = new char[length];
		int n = 0;
		
		for (int i =(length - 1) ; i >= 0; --i) {
			
			resultArray[n] = charArray[i];
			n++;
		}
		
		String result = String.valueOf(resultArray);
		return result;
	}
	
}
