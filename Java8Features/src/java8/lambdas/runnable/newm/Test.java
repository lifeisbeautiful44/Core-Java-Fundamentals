package java8.lambdas.runnable.newm;

public class Test {

	public static void main(String[] args) {
		System.out.println("With using lambdas..");
		System.out.println();
		System.out.println();

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("CHild Thread: " + i);
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread: " + i);
		}
	}

}
