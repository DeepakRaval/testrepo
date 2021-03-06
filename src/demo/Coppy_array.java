package demo;

public class Coppy_array {
	
	
	public static void main(String[]arg){
		int [] source = {1,2,3,4};
		int[] destination = copyArray(source);
	
		for(int i = 0 ; i<destination.length; i++){
			System.out.println(destination[i]);
		}
	
	}
	
	// method for copping array
	static int[] copyArray(int [] src){
		
		int dst [] = new int[src.length];
		
		for(int i = 0 ; i<src.length ;i++){
			dst[i]=src[i];
		}
		return dst;
	}

}
