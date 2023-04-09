package anonyomuc.innerclass;

public class Test {
	
	public static void main(String[] args) {
		Test t = new Test();
		Connection con = DriverManager.getConnection();
	//	con.createStatement();
		System.out.println(con);
		System.out.println(t);
	}

}
