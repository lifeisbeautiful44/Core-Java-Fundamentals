
public class Test  {
	
	


	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() 
		{
			
			@Override
				public void run() {
					System.out.println(" I am an anonymous inner class");
				
			}
			
		}
		);
		
		System.out.println(t);
		t.start();
  

		
	
		
	}



}
