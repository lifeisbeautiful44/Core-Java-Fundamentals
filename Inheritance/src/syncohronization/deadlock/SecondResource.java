package syncohronization.deadlock;

public class SecondResource {
	
	public synchronized void srMethod1(FirstResource f1)
	{
		System.out.println("Inside Second Recource...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Trying to call First resource Method");
		f1.frMethod2();
		
		
		
	}
	
	public synchronized void srMethod2()
	{
		System.out.println("Second Resource resource method 2");
	}
	

}
