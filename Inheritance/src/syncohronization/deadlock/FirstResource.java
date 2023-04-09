package syncohronization.deadlock;

public class FirstResource {
	
	public synchronized void frMethod1(SecondResource f2)
	{
		System.out.println("Inside First Recource...");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Trying to call SecondResource Method");
		
		f2.srMethod2();
		
	}
	
	public synchronized void frMethod2()
	{
		System.out.println("First resource method 2");
	}
	

}
