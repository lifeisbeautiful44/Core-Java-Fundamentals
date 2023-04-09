package staticinnerclass;

public class Outer {

	static void f1() {
		System.out.println(" Static Outer method.");
	}

	static class Inner {

		static void f2() {
			System.out.println(" Static Inner method.");
		}

		public void f3() {
			System.out.println("Non static inner method.");
		}
	}

	public static void main(String[] args) {
		Outer.f1();
		Outer.Inner.f2();

		Outer.Inner inner = new Outer.Inner();
		inner.f3();

	}

}
