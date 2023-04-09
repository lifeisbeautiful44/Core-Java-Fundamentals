package java9.lambdas.defaultmethods;

public interface A {
	
	default void method()
	{
		System.out.println("Inside A, method");
	}

}
