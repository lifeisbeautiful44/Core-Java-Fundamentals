package constructorchaining;

public class ChildClass extends SuperClass {

	ChildClass() {
		this(10);
		System.out.println("No arg child class constructor.");
	}

	ChildClass(int b) {
		super(b);
		System.out.println("Arg Childclass constructor");
	}

}
