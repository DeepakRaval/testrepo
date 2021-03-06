package demo;

public class Child_Immutable {

	final int year;
	final int month;
	final int date;
	
	public Child_Immutable(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Child_Immutable [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	
	
	
}
