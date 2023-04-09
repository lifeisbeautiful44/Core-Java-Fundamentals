
public class SingleThreading {

	public void display() {
		for (int j = 0; j < 15; j++) {
			System.out.print("j :" + j + "\t");

		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {
			System.out.print("i :" + i + "\t");

		}
		SingleThreading st = new SingleThreading();
		st.display();
	}

}
