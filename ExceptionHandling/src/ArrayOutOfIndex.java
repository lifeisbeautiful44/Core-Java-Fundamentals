
public class ArrayOutOfIndex {

	public static void main(String[] args) {
		try {
		int[] arr = { 1, 2, 3 };

		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);

		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You need to check the aaray limitation, it index strats with 0 --> "+e);
		}
		

	}

}
