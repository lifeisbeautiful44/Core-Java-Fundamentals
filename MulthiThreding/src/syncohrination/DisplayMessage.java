package syncohrination;

public class DisplayMessage {
	
		
		public synchronized void message(String name)
		{
			for(int i = 0 ; i<10; i++)
			{
				System.out.println("I belong to this "+ name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
		}

	

}
