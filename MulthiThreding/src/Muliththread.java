
public class Muliththread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		Muliththread mt = new Muliththread();
		mt.start();
		
		 Thread currentThread = Thread.currentThread();	
		 System.out.println(currentThread.getName());
		
		         
	/*	for (int i = 0; i < 15; i++) {
			System.out.println("i :" + i );
			Thread.sleep(1000);
		}
      */
	}

	public void run() {
		
		Thread currentThread = Thread.currentThread();
		System.out.println();
		currentThread.setName("Printing Numbers ");
		System.out.println(currentThread.getName());
		/*
		for (int j = 0; j < 15; j++) {
			System.out.println("j :" + j );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Something went wrong...");
			}

		}
		*/
	}
}
