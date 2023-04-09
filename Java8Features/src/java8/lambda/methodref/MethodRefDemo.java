package java8.lambda.methodref;

public class MethodRefDemo {

	static void mymethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ChildThread.");
		}
	}

	public static void main(String[] args) {

		Runnable r = MethodRefDemo::mymethod; // mapping with the funcational interface runnable

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread.");
		}

	}

}
