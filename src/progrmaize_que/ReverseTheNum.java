package progrmaize_que;

public class ReverseTheNum {
	
	public static void main(String[]args){
		reverseTheNum(78576);
	}
	
	static void reverseTheNum(int a){
		int rev = 0;
		while(a != 0){
			int digit = a % 10;
			rev = rev*10 + digit;
			a /= 10;
		}
		System.out.println(rev);
		
	}

}
