
public class RunnableInterfaceDemo implements Runnable  {

	@Override
	public void run() {

		System.out.println("Strating run method");
	}
	
	public static void main(String[] args) {
		RunnableInterfaceDemo rD = new RunnableInterfaceDemo();
		Thread th = new Thread(rD);
		th.start();
		
		
	}
	
	

}
