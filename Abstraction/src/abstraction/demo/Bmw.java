package abstraction.demo;

public abstract class Bmw {
	
	Bmw()
	{
		System.out.println("I am a constructor of abstract");
	}
	
	void commonFunction()
	{
		System.out.println("I am a normal function.");
	}
	
	  abstract void accelerate();

}
