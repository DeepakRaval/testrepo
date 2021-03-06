package demo;

public class EmployeeTestImmutable {
	
	public static void main(String[]args){
		AddresImmutable address = new AddresImmutable();
		address.setCity("Pune");
		address.setArea("Wakad");
		address.setCodePin(123456);
		
		EmployeeImmutable employee = new EmployeeImmutable(21, "Ramanand", address);
		System.out.println(employee.toString());
	}

}
