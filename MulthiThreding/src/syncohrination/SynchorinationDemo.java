package syncohrination;

/*
 Synchronication, when two thread , try to access the same object, they
 might corrupt each other data,
 Here in the Displaymessage object, dm object is access by the thread t1 and t2.
 so when t1, access the displaymessage , and t2 will also acces the same object simulatenausly,
 so inorder to prevent that we use synchronized in that particular method , 
 so when t1 is doing some operation on displaymessage, then it locks it , after it complete 
 then only t2 will able to access it ..
 
 */
public class SynchorinationDemo {
	
	public static void main(String[] args) {
		
		DisplayMessage dm = new DisplayMessage();
		
		MyThread t1 = new MyThread(dm, "Srijansil");
		MyThread t2 = new MyThread(dm, "Aarati");
		
		t1.start();
		t2.start();
		
		
	}

}
