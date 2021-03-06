package demo;

public class MissingTerm {
	
	public static void main(String[] arg) { 
		
		int [] num = {1,2,3,4,5,6};
		int res = findMissing(num);
		System.out.println("The missing term is "+res);

	}
	
	static int findMissing(int [] x){
		int a = 0;
		for(int i = 0; i<x.length; i++){
			
			a = a + x[i];
			}
		int result = 21 - a;
		return result;
	}
}
