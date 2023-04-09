package threadcommunication;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {

		Mythread m1 = new Mythread();
		m1.start();

		synchronized (m1) {
			System.out.println("Main Thread");
			System.out.println(m1);
			m1.wait();
			System.out.println("Lock is realesed");
			System.out.println(m1.total);

		}

	}

}
