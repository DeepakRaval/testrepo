package demo;
//Object
public class MethodsDemo {

	public static void main(String[]args){
		
		// **** finalize methods ****
		MethodsDemo m1 = new MethodsDemo();
		System.out.println(m1.hashCode());
		
		
		m1 = null;
		
		// calling Garbage collector
		System.gc();
		System.out.println("end");
	
	}
	@Override
	protected void finalize(){
		System.out.println("finilize method called");
	}

}
