package demo;

public class Additioin_loop {
	
	public static void main(String[]args){
		int [] num = {1,2,3,4,5};
		int l = num.length;
	int res_sum = sum(num);
	int res_avg = avarage(res_sum, l);
	System.out.println("The avarage = "+res_avg+"\n The sum = " + res_sum);
	
	}
	
	static int sum (int [] x){
		int n = 0;
		for(int i = 0 ; i<x.length;i++){
					n=n +x[i]; 
		}
//		System.out.println(n);
		// change in remote
		return n;
	}
	
	static int avarage(int sum, int l){
		int result ;
		result = sum/l;
		return result;
	}

}
