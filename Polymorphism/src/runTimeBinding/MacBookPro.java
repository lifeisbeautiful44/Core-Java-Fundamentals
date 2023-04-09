package runTimeBinding;

public class MacBookPro extends MacBook {
	
	@Override
	void start() {
		super.start();

		System.out.println("I am  MacbookPro start() method.");

	}

	@Override
	void shutDown() {
		super.shutDown();

		System.out.println("I am  MacbookPro shutDown() method.");

	}	

}
