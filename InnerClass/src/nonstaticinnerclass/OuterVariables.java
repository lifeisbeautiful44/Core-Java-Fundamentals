package nonstaticinnerclass;

public class OuterVariables {
	private static int x = 10;
	private int y;

	public OuterVariables(int y) {
		this.y = y;
	}

public class InnerVariables {
		private int y;

		public InnerVariables(int y) {
			this.y = y;
		}

		public void display() {
			System.out.println("Outer class static variable " + OuterVariables.x);
			System.out.println("Outer class non static variables " + OuterVariables.this.y);
			System.out.println("Inner class variable " + this.y);
		}
	}

	public static void main(String[] args) {

		OuterVariables ov = new OuterVariables(40);
		OuterVariables.InnerVariables inner = ov.new InnerVariables(30);

		inner.display();

	}

}
