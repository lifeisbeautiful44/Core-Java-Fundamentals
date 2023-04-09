package interrupt;

public class InterruptDemo {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		myThread.interrupt();

		System.out.println("End of main method");

	}

}
