package daemonthread;

public class DaemonThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());

		MyThread t1 = new MyThread();
//	    Thread t2 = new Thread();

		t1.setDaemon(true);
		t1.start();
	}

}
