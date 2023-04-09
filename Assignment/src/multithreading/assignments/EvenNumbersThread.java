package multithreading.assignments;

public class EvenNumbersThread extends Thread {
	
	public  void  run()
	{
		synchronized (this) {
			for(int i = 1; i<10; i++)
			{
				if(i%2 == 0)
				{
					System.out.println("Even Number "+ i);
				}
			}
		
		}
	
	}

}
