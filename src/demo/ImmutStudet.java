package demo;

public final class ImmutStudet {
	
	private final int StdRollNo;
	private final String name;
	  ChildAge age;
	
	public ImmutStudet(int stdRollNo, String name, ChildAge age) {
		super();
		StdRollNo = stdRollNo;
		this.name = name;
		ChildAge copyAge = new ChildAge();
		copyAge.setDate(age.getDate());
		copyAge.setDate(age.getMonth());
		copyAge.setYear(age.getYear());
		this.age = copyAge;
	}

	public int getStdRollNo() {
		return StdRollNo;
	}

	public String getName() {
		return name;
	}

	public ChildAge getAge() {
		ChildAge c = new ChildAge();
		c.setDate(age.getDate());
		c.setMonth(age.getMonth());
		c.setYear(age.getYear());
		return c;
	}
	
	
	
	

}
