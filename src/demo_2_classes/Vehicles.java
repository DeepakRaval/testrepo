package demo_2_classes;

public class Vehicles {
String name;
String type;
String fule;
int milage;
String seatingCapasity;


	public Vehicles(String name, String type, String fule, int milage, String seatingCapasity) {
	super();
	this.name = name;
	this.type = type;
	this.fule = fule;
	this.milage = milage;
	this.seatingCapasity = seatingCapasity;
}


	public static void main(String[] args) {
		Vehicles v1 = new Vehicles("TATA - C/1511", "Bus", "Diese",5,"48");
		displayVehicle(v1);
		Vehicles v2 = new Vehicles("Bajaj - Dominar", "Bike", "Petrol", 35,"2");
		displayVehicle(v2);
		Vehicles v3 = new Vehicles("Hyundai - Creata", "Car", "Diese",19,"5");
		displayVehicle(v3);
		Vehicles v4 = new Vehicles("Toyota - Inovo", "car (MPV)", "Diese",15,"7");
		displayVehicle(v4);
	}
	
	static void displayVehicle(Vehicles v){
		System.out.println("\n Made: "+v.name+"\n Type: "+v.type+"\n Fule: "+v.fule+"\n Milage: "+v.milage+"\n Seating capasity: "+v.seatingCapasity);
	}
	
	

}
