package multilevel;

public class Child extends Parent {
	
	Child()
	{
		System.out.println("Childobject:"+this);
	}

	public void f2() {
		System.out.println("I am a child class.");
	}
}
