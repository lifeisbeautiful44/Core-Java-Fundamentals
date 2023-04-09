package syncohronization.deadlock;

public class DeadlockDemo extends Thread {

	FirstResource f1 = new FirstResource();
	SecondResource s1 = new SecondResource();

	DeadlockDemo() {

//		Thread t1 = new Thread();
//		t1.start();
		new Thread(this).start();
		s1.srMethod1(f1);

	}

	public static void main(String[] args) {
		new DeadlockDemo();

	}

	@Override
	public void run() {
		f1.frMethod1(s1);
	}
}
