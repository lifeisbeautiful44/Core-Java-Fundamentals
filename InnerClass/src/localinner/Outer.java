package localinner;

public class Outer {

	void f1() {
		System.out.println("Inside Outer f1 method(). ");

		class LocalInner {
			void f2() {
				System.out.println(" I am Local Inner class inside f2() of f1()");
			}

		}

		LocalInner ln = new LocalInner();
		ln.f2();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();
	}

}
