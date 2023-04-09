package java8.lambda.methodref;

public class MyClass {
	
	public void myMethod123(int i, String s)  //the argument should be same, though you can have different reutrn type and name.
	{
		System.out.println("Using " + s + " " + i);
	}

	public static void main(String[] args) {
		
		MyfunctionalInterface f = (i,s) -> System.out.println(s + " " + i);
		f.myMethod(10,"Using lambdas");
		
		MyClass clss = new MyClass();
		MyfunctionalInterface f1 = clss::myMethod123; //mapping with the Myfunctional interface.
		f1.myMethod(20, "double colon, mapping");

	}

}
