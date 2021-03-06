package demo;

public class Palindrome {

	public static void main(String[] args) {
		String test = "dada";
		
		StringBuffer check = new StringBuffer(test);
		System.out.println("Orinal string= "+check);
		StringBuffer reversed = check.reverse();
		System.out.println("reversed string= "+reversed);
		System.out.println(check.equals(reversed));

		// by logical method
		String finalString = reverseString(test);
		System.out.println("Reversed string *Using logic*= " + finalString);
		palindrone(test, finalString);
	}

	static String reverseString(String test) {

		int length = test.length();

		char[] charArray = new char[length];
		charArray = test.toCharArray();

		char[] resultArray = new char[length];
		int n = 0;

		for (int i = (length - 1); i >= 0; --i) {

			resultArray[n] = charArray[i];
			n++;
		}

		String result = String.valueOf(resultArray);
		return result;
	}
	
	static void palindrone(String a,String b){
		if((a.equals(b))==true){
			System.out.println("String is Palindrone ");
		}else{
			System.out.println("String is not Palindrone....!!! ");
		}
		
	}

}
