package java8.lambdas.annonymos;

public class Test {

	public static void main(String[] args) {

//		Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("child  Thread: " + i);
//				}
//			}
//		});
//
//		t.start();
		
		Thread t = new Thread(() -> {
			for (int i = 0; i<10; i++)
			{
				System.out.println("Child Thread: "+ i);
			}
			
		});
		t.start();

	}

}
