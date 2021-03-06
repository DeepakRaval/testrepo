package operators;

public class Logical_ort {
	
	public static void main(String []args){
		int a = 10;
		int b = 20;
		String result;
		// AND logical operator
		if(a>7 && b>10){
			System.out.println("this condition is true ");
		}else{
			System.out.println("not true");
		}
		// OR logical operator
		if(a>7 || b>30){
			System.out.println("this condition is true ");
		}else{
			System.out.println("not true");
		}
		
		//turnaty operators
		result = (a>9)? "a = 10":"a is not equal to 10";
		System.out.println(result);
		
	}

}
