package syncohrination.block;


public class SynchorinationDemo {
	
	public static void main(String[] args) {
		
		DisplayMessage dm = new DisplayMessage();
		
		MyThread t1 = new MyThread(dm, "Srijansil");
		MyThread t2 = new MyThread(dm, "Aarati");
		
		t1.start();
		t2.start();
		
		
	}

}
