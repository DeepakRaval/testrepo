package demo;

public class Objects_array {
int rollNo;
String name;
	public Objects_array(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}
	@Override
	public String toString() {
		return "Objects_array [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Objects_array o1 = new Objects_array(10, "Deepak");
		Objects_array o2 = new Objects_array(12, "ram");
		
		Object [] elements = {"add",o1,202,o2};
		
		for(int i = 0 ; i<elements.length; i++){
			if(elements[i] instanceof Objects_array){
				System.out.println(elements[i]);
			}
		}

	}

}
