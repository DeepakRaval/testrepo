package progrmaize_que;

public class CountingNo {
	
	public static void main(String[]args){
		
		countDigit(764636547);
	}
	
	static void countDigit(int number){
		int count = 0;
		while(number != 0){
			// number = number / 10
			number /= 10;
			count ++;
			
		}
		System.out.println(count);
		
	}

}
