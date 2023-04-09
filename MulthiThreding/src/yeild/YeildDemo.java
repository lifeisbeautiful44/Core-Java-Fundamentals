package yeild;

public class YeildDemo  {
	
      public static void main(String[] args) {
		Mythread mythread = new Mythread();
		mythread.start();
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("Main Thread ");
		}
	}
         
}
