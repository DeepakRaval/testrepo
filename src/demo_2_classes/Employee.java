package demo_2_classes;

public class Employee {
	String name;
	int id;
	int salary;

	@Override
	public String toString() {
		return "\n Name: " + name + "\n Id: " + id + " \n Salary: " + salary + "]";
	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Deepak", 7652, 76299);
		System.out.println("Name of Employee : " + e1.name + "\n Id of Employee: " + e1.id + "\n Salary: " + e1.salary);

		// Printing of values by calling method
		Employee e2 = new Employee("Ronaldo", 3432, 65342);
		e2.display_Info(e2);

		Employee e3 = new Employee("Messi", 4598, 65543);
		e3.display_Info(e3);

		Employee e4 = new Employee("Pele", 6511, 76122);
		Employee e5 = new Employee("Nemar", 1547, 76122);
		Employee e6 = new Employee("Pepe", 5437, 76122);
		Employee e7 = new Employee("Diago", 6987, 76122);
		
		// this is the priting of values by tostring method
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);

		// Custumized method calling
		print_info("Cristiano", 7648, 90889);
	}

	void display_Info(Employee e) {
		System.out.println("\n Name: " + e.name + "\n Id: " + e.id + "\n Salary: " + e.salary);
	}

	static void print_info(String a, int b, int c) {
		System.out.println("\n Name: " + a + "\n Id: " + b + "\n Salary: " + c);
	}
}
