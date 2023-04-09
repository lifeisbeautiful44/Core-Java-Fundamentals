package efdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {

		CheckProcessor[] cp = { new CheckProcessor("Bank"), new CheckProcessor("ATM"),
				new CheckProcessor("Mobile Banking") };

		ExecutorService service = Executors.newFixedThreadPool(2);
		
		
		for (CheckProcessor checkProcessor : cp) {
			service.submit(checkProcessor);
		}
		
		service.shutdown();

	}

}
