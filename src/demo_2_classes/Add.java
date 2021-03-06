package demo_2_classes;

public class Add {
	public static void main(String[] arg) {
		int r1 = m1(10);
		int r2 = m2(20);
		m3(r1, r2);

	}

	static int m1(int a) {
		int p = a;
		return p;
	}

	static int m2(int b) {
		int q = b;
		return q;
	}

	static void m3(int a, int b) {
		int r = a + b;
		System.out.println("result = "+r);
	}

}
