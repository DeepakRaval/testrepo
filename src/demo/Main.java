package demo;

// This is the program of having multiple classes in one class 

public class Main {

	public static void main(String[] args) {
		System.out.println(" **In side main method of Class Main ** ");

		Student d2 = new Student();
		d2.stud_info("Deepak", 65);

	}

	public static class Addition {
		// Here one thing is even after calling main method in another class 
		// this will not work
		public static void main(String[] args) {
			System.out.println("In side another main Method =|=|= ");
		}

		void addition() {
			int a, b = 20, c = 10;
			a = b + c;
			System.out.println("\n Addition = " + a);

		}
	}

	static class Employee {
		void emp_info(String a, int b) {
			System.out.println(" **In side class Employee**" + " \n Name: " + a + " \n Employee Id: " + b);

			Addition a1 = new Addition();
			a1.addition();
		}
	}

	static class Student {
		void stud_info(String a, int i) {
			System.out.println(" **In class Student**" + "\n Name: " + a + "\n roll no: " + i);

			Employee d1 = new Employee();
			d1.emp_info("Onakar", 8765);
		}
	}

}
