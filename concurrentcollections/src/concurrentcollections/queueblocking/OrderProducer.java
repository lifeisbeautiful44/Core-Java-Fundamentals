package concurrentcollections.queueblocking;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		try {
			queue.put("1st order");
			queue.put("2nd order");
			queue.put("3rd order");

		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		
	}

}
