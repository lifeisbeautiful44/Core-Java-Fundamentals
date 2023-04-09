package efdemo;

public class CheckProcessor implements Runnable {
	String name;

	public CheckProcessor(String name) {
		this.name = name;
	}

	@Override
	public void run() {
             System.out.println(name + " is the process that is being started: "+ Thread.currentThread().getName());
             
             try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
             System.out.println("Check processor " + name + " is being completed");
             
	}

}
