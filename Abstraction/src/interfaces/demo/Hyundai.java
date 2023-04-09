package interfaces.demo;

public class Hyundai implements Car {

	@Override
	public void accelerate() {
		System.out.println("acceletrae method");
	}

	@Override
	public void brake() {
		System.out.println("brake method");
	}

}
