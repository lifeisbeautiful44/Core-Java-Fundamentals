package runTimeBinding;


/*
   So RunTime polymorphism is basicaly, method overriding concept,
    In which a child class functionality or reference is hold by the,
    parent class reference variable. In doing so, 
    parent class reference variable cannot access the specific method of child class,
    hence, we use object casting to use that methods.
*/
public class Test {

	
	public static void main(String[] args) {
		MacBook m1 = new MacBookAir();	  //Upcasting

		
		m1.start();
		m1.shutDown();
	
		
		MacBookAir m3 = (MacBookAir)m1;   //object casting. (Downcasting)
		m3.macbookmethod();
		
		
		MacBook m2 = new MacBookPro();
		m2.start();
		m2.shutDown();
		
		
	}
}
