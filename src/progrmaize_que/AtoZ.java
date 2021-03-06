package progrmaize_que;

public class AtoZ {

	public static void main(String[]args){
		a_to_z();
	}
	
	static void a_to_z(){
		char c ;
		for(c = 'A' ; c < 'Z'; ++c){
			if(c =='R'){
				System.out.println("\n");
			}
				
			System.out.print(c+" ");
		}
	}
}
