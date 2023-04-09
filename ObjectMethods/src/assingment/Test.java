package assingment;

public class Test {
	public static void main(String[] args) {
		ElectricityBill customer1 = new ElectricityBill();
		customer1.setMeterNo(123);
		customer1.setName("Srijansil");
		customer1.setAddress("Khausaltar, Bhaktapur.");

		ElectricityBill customer2 = new ElectricityBill();
		customer2.setMeterNo(123);
		customer2.setName("Srijansil");
		customer2.setAddress("Khausaltar, Bhaktapur.");

		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer1.equals(customer2));
		System.out.println(customer1.hashCode());
		System.out.println(customer2.hashCode());

	}

}
