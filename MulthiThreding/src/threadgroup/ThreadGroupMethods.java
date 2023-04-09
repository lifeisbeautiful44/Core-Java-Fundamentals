package threadgroup;

public class ThreadGroupMethods {
	
	public static void main(String[] args) throws InterruptedException {
	 	ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
	 	
	 	CustomThread t1 = new CustomThread(threadGroup, "Thread1");
	 	CustomThread t2 = new CustomThread(threadGroup, "Thread2");
	 	CustomThread t3 = new CustomThread(threadGroup, "Thread3");
	 	
	 	t1.start();
	 	t2.start();
	 	t3.start();
	 	
	 	threadGroup.list();
       System.out.println(threadGroup.activeCount());
        CustomThread.sleep(5000);
        System.out.println(threadGroup.activeCount());
	 	threadGroup.list();

        

	}

}
