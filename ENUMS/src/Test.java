
public class Test {

	public static void main(String[] args) {

		//PaymentType pt = PaymentType.ATM;
//		System.out.println(pt.getFee());

		PaymentType[] values = PaymentType.values();

		for (PaymentType paymentType : values) {
			System.out.println(paymentType);
			System.out.println("The position is: " + paymentType.ordinal());
			System.out.println("Fee is $" + paymentType.getFee());
			System.out.println();
		}

	}

}
