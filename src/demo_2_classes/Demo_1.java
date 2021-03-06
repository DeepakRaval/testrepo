package demo_2_classes;

public class Demo_1 {
	final int i;

	public Demo_1(int i) {
		super();
		this.i = i;
	}

	public static void main(String[] args) {
		// we can initialize the final blank method multiple time by creating a
		// another or new objects but it is not possible in a same method
		
		Demo_1 d1 = new Demo_1(10);
		// d1.i = 54;
		System.out.println(d1.i);

		Demo_1 d2 = new Demo_1(20);
		System.out.println(d2.i);
	}

}