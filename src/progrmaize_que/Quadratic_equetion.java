package progrmaize_que;
// Program to find roots of quadratic equation.

public class Quadratic_equetion {

	public static void main(String[] arg) {
		// pass the values of a b and c from the quadratic equation
		double a = 2, b = 5 ,c = 1;
		double determinant = (b * b) - (4 * a * c);
		System.out.println("Determinant = "+ determinant);

		if (determinant == 0) {
			double root = (-b / (2 * a));
			System.out.println("The root of the Equation " + root);
		} else if (determinant > 0) {
			double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.println("Root 1 = " + root1+" and \n Root 2 = " + root2);
		} else {
			double real = (-b / (2 * a));
			double imaginary = (Math.sqrt(determinant) / (2 * a));
			System.out.println("Root 1 = " + real+" + " + imaginary);
			System.out.println("Root 2 = " + real+" - " + imaginary);
		}
	}
}
// determinant == 0
// root1 = root2 = -b / (2 * a);

// determinant > 0
// root1 = (-b + math.sqrt(determinant))/(2*a)
// root2 = (-b - math.sqrt(determinant))/(2*a)

// Determinant < 0
// real = -b / (2 * a);
// imaginary = Math.sqrt(-determinant) / (2 * a)
