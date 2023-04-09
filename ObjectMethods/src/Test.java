
public class Test {

	public static void main(String[] args) {
		Passeneger p1 = new Passeneger();
		p1.setFirstName("Srijansil");
		p1.setLastName("Bohara");
		p1.setId(1232);
		
		Passeneger p2 = new Passeneger();	
		p2.setFirstName("kabindra");
		p2.setLastName("Bohara");
		p2.setId(12324);
		

		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p1.equals(p2));
		

	}

}
