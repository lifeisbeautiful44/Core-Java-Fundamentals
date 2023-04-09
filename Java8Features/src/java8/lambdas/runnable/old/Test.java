package java8.lambdas.runnable.old;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Withour using lambdas ...");
		System.out.println();
		System.out.println();

		Runnable r= new MyRunnableImpl();
		
		Thread t = new Thread(r);
		
		t.start();
		for (int i = 0; i<10; i++)
		{
			System.out.println("Main Thread: "+ i);
		}
		
		
		
	}
	
	
	

}
