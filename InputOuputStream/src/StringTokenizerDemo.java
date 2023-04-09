import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello, everyone my name is Srijansil Bohara.";

		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	

	}

}
