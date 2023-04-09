package anonyomuc.innerclass;

public class AnonymosRunnable {
	public static void main(String[] args) {
		
//		Thread t = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Anonymous Runnable Implementaiton");
//				
//			}
//		});
//	 t.start();	
		
		Runnable  r = new Runnable() {
			
			@Override
			public void run() {
                 System.out.println("something ..");				
			}
			
		};
			 System.out.println(r);
	 
	}
	

}


