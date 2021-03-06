package demo;

public class EmployeeImmutable {
	
	private final int id;
	private final String name;
	private final AddresImmutable address;
	
	public EmployeeImmutable(int id, String name, AddresImmutable address) {
		super();
		this.id = id;
		this.name = name;
		
		AddresImmutable copyAddress = new AddresImmutable();
		copyAddress.setCity(address.getCity());
		copyAddress.setArea(address.getArea());
		copyAddress.setCodePin(address.getCodePin());
		this.address = copyAddress;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public AddresImmutable getAddress() {
		AddresImmutable copiedAddress = new AddresImmutable();
		copiedAddress.setCity(address.getCity());
		copiedAddress.setArea(address.getArea());
		copiedAddress.setCodePin(address.getCodePin());
		return address;
	}

	@Override
	public String toString() {
		return "Employee:\nid= " + id + ", name= " + name + "\naddress:" + address + "";
	}
	
	
	
	
	

}
