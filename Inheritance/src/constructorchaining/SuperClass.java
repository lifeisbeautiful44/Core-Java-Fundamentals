package constructorchaining;

public class SuperClass {

	SuperClass() {
		System.out.println("I am no arg Parent Constuctor.");
	}

	SuperClass(int a) {
		this();
		System.out.println("I am a arg Parent Constructor");
	}

}
