package demo;

public class Sorting {
	int salary;
	String department;
	String name;
	
	public Sorting(int salary, String department, String name) {
		super();
		this.salary = salary;
		this.department = department;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Sorting [salary=" + salary + ", department=" + department + ", name=" + name + "]";
	}


	public static void main (String[]arg){
		
		Sorting t1 = new Sorting(12000, "Mechanical","b sir");
		Sorting t2 = new Sorting(13000, "ITC","a sir");
		Sorting t3 = new Sorting(11000, "Mechanical","G sir");
		Sorting t4 = new Sorting(15000, "ITC","h sir");
		Sorting t5 = new Sorting(17000, "Mechanical","r sir");
		Sorting t6 = new Sorting(10000, "Civil","q sir");
		Sorting t7 = new Sorting(9000, "ITC","p sir");

		Sorting [] teahers = {t1,t2,t3,t4,t5,t6,t7};
		Sorting [] result1 =departmentVise(teahers,"ITC");
		System.out.println(result1);
		
		Sorting [] result2 = maxPayment(teahers,17000);
		System.out.println(result2);
		

		
	}
	
	static Sorting[] departmentVise(Sorting [] x ,String b){
		Sorting [] result = new Sorting[x.length];
		for (int i = 0; i < x.length; i++) {
			Sorting s1 = (Sorting)x[i];
			if(s1.department == b){
			System.out.println(x[i]);
			}
			result[i]=x[i];
		}
		
		return result;		
	}
	
	static Sorting[] maxPayment(Sorting [] x , int a){
		Sorting [] result = new Sorting[x.length];
		for (int i = 0; i < x.length; i++) {
			Sorting s1 = (Sorting)x[i];
			if(s1.salary >= a){
			System.out.println(x[i]);
			}
			result[i]=x[i];
		}
		
		return result;		
	}
	

}
