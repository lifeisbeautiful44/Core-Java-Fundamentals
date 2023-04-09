package efdemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable [] mc = { new MyCallable(1), new MyCallable(2), new MyCallable(3),new MyCallable(4)};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for (MyCallable myCallable : mc) {
			
	       Future<Integer> future =   service.submit(myCallable);	
	       System.out.println(future.get());
	         
		}
		
		service.shutdown();
		
	}

}
