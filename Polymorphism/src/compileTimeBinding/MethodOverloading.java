package compileTimeBinding;

/*
  In method overloading the signature type should be different 
for example, void add(int a, int b) or void add(float a, float b)
or,
signature must have different parameters.
Note: 
	We can overload by using the  return type ..
	*/

public class MethodOverloading {

	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result is: " + result);
	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println("Result is: " + result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Result is: " + result);
	}

//	int add(int a, int b)
//	{
//		int result = a+b;
//		return result;
//		System.out.println("Result is: "+result);
//	}

	public static void main(String[] args) {

		MethodOverloading meOverld = new MethodOverloading();
		meOverld.add(1, 3);
		meOverld.add(1, 4f);
		meOverld.add(1, 0, 3);

	}

}
