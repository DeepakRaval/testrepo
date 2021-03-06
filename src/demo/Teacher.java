package demo;

public class Teacher {
	String teacherName;
	int teacherSalary;
	

	public Teacher(String teacherName, int teacherSalary) {
		super();
		this.teacherName = teacherName;
		this.teacherSalary = teacherSalary;
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", teacherSalary=" + teacherSalary + "]";
	}

	public static void main(String[] arg) {
		Teacher t1 = new Teacher("abc sir", 12000);
		Teacher t2 = new Teacher("pqr sir", 2000);
		Student s1 = new Student(11, 35);
		Student s2 = new Student(11, 87);
		Object[] element = { t1, t2, s1, s2 };
		studentResult(element);
		teacherPayment(element);

	}

	static void studentResult(Object[] x) {
		System.out.println("** in student **");
		for (int i = 0; i < x.length; i++) {

			if (x[i] instanceof Student) {
				Student s1 = (Student)x[i]; // the casting of parent object to child 
				if(s1.marks < 40){
				System.out.println(x[i].toString());
				}
			}

		}

	}

	static void teacherPayment(Object[] y) {
		System.out.println("** in Teacher **");
		for (int i = 0; i < y.length; i++) {
			if (y[i] instanceof Teacher) {
				Teacher t = (Teacher)y[i];// the casting of parent object to child 
				if(t.teacherSalary < 5000){
				System.out.println(y[i]);
				}
			}

		}

	}

}
