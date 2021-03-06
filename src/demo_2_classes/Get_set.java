package demo_2_classes;

public class Get_set {
	int id ;
	String name ;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}




	public static void main (String []arg){
		Get_set g1 = new Get_set();
		g1.setId(5421);
		
		g1.setName("Rahul");
		System.out.println(g1.getId()+g1.getName());
		
	}

}
