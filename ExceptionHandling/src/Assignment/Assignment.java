package Assignment;

public class Assignment {
	
	public static void main(String[] args)  {
	
//		try {
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException e)
//		{
//			throw new MyThreadException("My custom exception");
//		}
//		
		
		try {
			
			throw new MyThreadException("Custom Exception");
			
			
		}
		catch(MyThreadException e)
		{
			System.out.println(e);
		}
		System.out.println("Porgram continues");
		
	}

}
