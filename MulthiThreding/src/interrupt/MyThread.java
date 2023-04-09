package interrupt;

public class MyThread extends Thread{
	@Override
	public void run() {
		try {
		for(int i  =0 ; i<5; i++)
		{
			System.out.println("Priniting 5 times");
			Thread.sleep(1000);
			
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
