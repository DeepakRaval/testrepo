package demo;
public class Salary {
	int a ;
	String name;
	
@Override
	public String toString() {
		return "Salary [a=" + a + ", name=" + name + "]";
	}

public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

public static void main(String[]args){
	// considering ctc / gross salary = 620000;
	double grossSalary = 620000;
	double basicSalary = grossSalary * 0.50;
	double hra = basicSalary * 0.50;
	double providentFund = basicSalary * 0.12;
	double incomeTax = (grossSalary * 0.20);
	
	
	System.out.println(""+grossSalary +""+ basicSalary + ""+hra +""+ providentFund +""+ incomeTax );
			
}
}
