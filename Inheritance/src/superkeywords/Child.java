package superkeywords;

public class Child extends Parent {
	
//	Child()
//	{
//		System.out.println("Child class constructor");
//	}
	
	int c , d;
	Child(int a , int b , int c ,  int d)
	{
		super(a,b);
		
		this.c = c;
		this.d = d;
		
		
		
	}
	
	void displayDetails()
	{
		System.out.println("Parent a " + super.a);
		System.out.println("Parent a " + super.b);
		System.out.println("Child c " + this.c);
		System.out.println("CHild d " + this.d);


	}
	
	public void f1()
	{
		super.f1();
		System.out.println("I am child f1() method.");
	}


}
