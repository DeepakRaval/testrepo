package demo;

public class TestStudentImmutale {
	
	public static void main(String[]args){
		ChildAge c = new ChildAge();
		c.setDate(1);
		c.setMonth(11);
		c.setYear(1996);
		ImmutStudet i = new ImmutStudet(1, "Ram", c);
		System.out.println(i.getName()+" "+i.getStdRollNo()+" "+i.getAge().getYear());
		
		ImmutStudet studen = new ImmutStudet(2, "Ram", c);
		System.out.println(studen.getName()+studen.getStdRollNo());
	}

}
