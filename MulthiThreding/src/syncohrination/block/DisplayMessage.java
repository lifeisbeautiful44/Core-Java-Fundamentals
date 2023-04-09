package syncohrination.block;

public class DisplayMessage {

	public void message(String name) {


		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.println("I belong to this " + name);
		
			}

		}

	}

	public synchronized void check() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I belong to this " + Thread.currentThread().getName());
		
		}

	}

}
