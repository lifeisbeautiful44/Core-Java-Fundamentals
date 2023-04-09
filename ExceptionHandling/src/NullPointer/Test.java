package NullPointer;

public class Test {

	static A a;

	public static void main(String[] args) {
		try {
			a.method();
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		System.out.println("Program still running");
	}

}
