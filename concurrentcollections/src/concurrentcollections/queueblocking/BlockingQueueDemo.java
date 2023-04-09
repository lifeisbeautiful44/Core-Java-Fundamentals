package concurrentcollections.queueblocking;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		
		
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
		OrderProducer producer= new  OrderProducer(queue);
		OrderConsumer consumer = new OrderConsumer(queue);
		
		new Thread(producer).start();
		new Thread(consumer).start();

		

	}

}
