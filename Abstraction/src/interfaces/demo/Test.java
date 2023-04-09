package interfaces.demo;


//An interface will automatically add its method as public abstract, 
//and no method can have a body , because they are abstract.


public class Test {
	
	public static void main(String[] args) {
		Hyundai h1 = new Hyundai();
		h1.accelerate();
		h1.brake();
		
	}
	
	

}
