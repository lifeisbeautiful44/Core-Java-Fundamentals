package multipileInheritance;

public class Test implements Circle,BigCircle {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int area(int a) {
		// TODO Auto-generated method stub
		return a;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.area(1));
	}

}
