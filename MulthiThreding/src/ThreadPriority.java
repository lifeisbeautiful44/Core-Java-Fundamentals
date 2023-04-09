
public class ThreadPriority extends Thread {

	public static void main(String[] args) {

		ThreadPriority tP1 = new ThreadPriority();
		tP1.setPriority(MIN_PRIORITY);
		tP1.setName("tP1");
		tP1.start();

		ThreadPriority tP2 = new ThreadPriority();
		tP2.setPriority(MAX_PRIORITY);
		tP2.setName("tP");
		tP2.start();

	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

}
