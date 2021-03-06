package demo;

public final class ImmutableClass {
	
	private final int stud_rollno ;
	private final String stud_name ;
	private final Child_Immutable c;



	public ImmutableClass(int stud_rollno, String stud_name, Child_Immutable c) {
		super();
		this.stud_rollno = stud_rollno;
		this.stud_name = stud_name;
		Child_Immutable copyC = new Child_Immutable( c.date, c.month, c.year);
		this.c = copyC;
	}

	public Child_Immutable getC() {
		return c;
	}	
	public int getStud_rollno() {
		return stud_rollno;
	}
	public String getStud_name() {
		return stud_name;
	}
	
	@Override
	public String toString() {
		return "ImmutableClass [stud_rollno=" + stud_rollno + ", stud_name=" + stud_name + ",\nc= " + c + "]";
	}


	
	
	
	
	

}
