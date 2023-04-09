package nonstaticinnerclass;

/*
     Note:We can declare the non-static method in the inner class.
     The class must be static inner class.
     */

public class Outer {

		public void f1() {
			System.out.println("Outer class non static method..");
		}

		static void f2() {
			System.out.println("Outer class static method.");
		}

		public class Inner {
			public void f2() {
				System.out.println("Inner class non static method.");
		
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Outer outer = new Outer();
			outer.f1();

			Outer.Inner inner = outer.new Inner(); // syantax to initatie the non static inner class..
		//	Outer.Inner inner = new Outer.Inner(); ->  sytanx to initaite the static inner class
			inner.f2();

		}

}
