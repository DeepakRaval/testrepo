package operators;

public class Istanceof {
	static int a = 10;
	public static void main(String[]args){
		String name = "Deepak";
		boolean result;
		boolean result1;
		Istanceof i1 = new Istanceof();
		
		result = name instanceof String;
		result1 = i1 instanceof Istanceof;
		System.out.println(result1);
		System.out.println(result);
		System.out.println(result1 + result);
	}

}
