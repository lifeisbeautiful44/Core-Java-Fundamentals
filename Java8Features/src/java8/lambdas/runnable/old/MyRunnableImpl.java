package java8.lambdas.runnable.old;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {

		
		for (int i = 0; i<10; i++)
		{
			System.out.println("Child Thread: "+ i);
		}
	}

}
