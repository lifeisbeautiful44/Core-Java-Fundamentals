
public enum PaymentType {

	CREDITCARD(5),DEBITCARD(10),ATM(0);
	
	int fee;
	
	PaymentType(int fee)
	{
		this.fee = fee;
	}
	
	public int getFee()
	{
		return fee;
	}
	
}

