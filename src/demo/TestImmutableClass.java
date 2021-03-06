package demo;

public class TestImmutableClass {
	
	public static void main(String[]arg){
		Child_Immutable c = input(1996, 12, 8);
		ImmutableClass i = new ImmutableClass(1, "Ram", c);
		System.out.println(i.toString());	
		
		Child_Immutable c1 = input(1997, 11, 9);
		ImmutableClass i1 = new ImmutableClass(2, "shma", c1);
		System.out.println(i1.toString());
	}
	
	static Child_Immutable input(int a,int b,int c){
		final int year = a;
		final int month = b;
		final int date = c;
		return new Child_Immutable(year, month, date);
	}

}
