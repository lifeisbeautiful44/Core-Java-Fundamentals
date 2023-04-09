package syncohrination.classlevellock;


public class SynchorinationDemo {
	
	public static void main(String[] args) {
		
		
		MyThread t1 = new MyThread("Srijansil");
		MyThread t2 = new MyThread( "Aarati");
		
		t1.start();
		t2.start();
		
		
	}

}
