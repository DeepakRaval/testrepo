package demo;

public class AddresImmutable {

	String city;
	String area;
	int codePin;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getCodePin() {
		return codePin;
	}
	public void setCodePin(int codePin) {
		this.codePin = codePin;
	}
	@Override
	public String toString() {
		return "\n city= " + city + "\n area= " + area + "\n codePin= " + codePin + "";
	}
	
	
	

}
