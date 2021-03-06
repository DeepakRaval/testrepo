package demo;

public class Demo123 {
	
	static{
		
		System.out.println("inside static method");
		
	}
	{
		System.out.println("in side instance method");
	}
	
	public static String foo(){
		System.out.println("in side foo method");
		return "";
	}

	
	public static void main(String[]arg){
//		Demo123 d1 = new Demo123();
		System.out.println(Demo123.foo());
		
		Employee e1 = new Employee();
		e1.e_id = 1;
		e1.e_name = "abc";
		
		
		
	}

}
class Student_123 extends Employee {
	int rollno;
	String studName;
}

class Employee {
	int e_id;
	String e_name;
}
