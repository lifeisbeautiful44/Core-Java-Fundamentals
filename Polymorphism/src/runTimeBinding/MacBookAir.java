package runTimeBinding;

public class MacBookAir extends MacBook {

	@Override
	void start() {
		super.start();
		System.out.println("I am  MacbookAir start() method.");

	}

	@Override
	void shutDown() {
		super.shutDown();
		System.out.println("I am  MacbookAir shutDown() method.");
	}
	
	void macbookmethod()
	{
		System.out.println("macbook method only.");
	}
	
	void commomFunc()
	{
		System.out.println("Coomon for all");
	}

}
