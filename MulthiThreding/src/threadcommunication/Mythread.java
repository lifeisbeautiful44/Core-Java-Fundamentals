package threadcommunication;

public class Mythread extends Thread{
	int total;
	@Override
	
	public void run() {
		synchronized(this) {
			System.out.println(this);
		for(int i = 0; i<10; i++)
		{
			total = total+i;
		}
		this.notify();
		
		System.out.println("I Am not in sncyhronized method..");
	}
	}

}
