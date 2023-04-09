package threadgroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		
		ThreadGroup parent = new ThreadGroup("Parent");
		System.out.println(parent.getName());
		
		ThreadGroup child = new ThreadGroup(parent, "child");
		System.out.println(child.getParent());
		
		Thread thread1 = new Thread(child, "t1");
		System.out.println(thread1.getThreadGroup());
		
		Thread thread2 = new Thread(child, "t2");
        System.out.println(thread2.getName());
        System.out.println(thread2);
        
        child.setMaxPriority(3);
		Thread thread3 = new Thread(child, "t2");
        System.out.println(thread3.getName());
        System.out.println(thread3);
        
		

		

	}

}
