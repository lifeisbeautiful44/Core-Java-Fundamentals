package encapsulation;

/*
Encapsulation is the concept of data binding in which we hide data to directly access from other objects,
so we use private field for properties and use getter and setter method to retrive and store the data.
*/
public class Test {

	public static void main(String[] args) {
		Customer c1 = new Customer();

		c1.setFirstName("Srijansil");
		c1.setLastName("Bohara");
		c1.setPhoneNumber(9748285695l);

		System.out.println("First Name: " + c1.getFirstName());
		System.out.println("Last Name: " + c1.getLastName());
		System.out.println("Phone Number: " + c1.getPhoneNumber());
		
		
	}

}
