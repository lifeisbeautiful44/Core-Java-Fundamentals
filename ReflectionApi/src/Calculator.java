
@MyAnnonation(value1 = "123", value2 = "456")
public class Calculator {
	
	private double num1;
	private double num2;
	
	public Calculator()
	{
		System.out.println("Default constructor.");
	}
	
	public Calculator(double num1, double num2)
	{
		this.num1 =num1;
		this.num2= num2;
	}
	
	{
		System.out.println("Default constructor.");
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public int sum(int num1, int num2)
	{
		return num1+num2;
	}
	
	

}
