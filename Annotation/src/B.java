import java.util.ArrayList;
import java.util.List;

public class B {

//	@SuppressWarnings(value = { "deprecation" })
	
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {

		A a =new A();
		System.out.println(a);
		a.method();
		a.method2();
		
		a.number = 10 ;
		System.out.println(a.number);
		
		List list = new ArrayList<>();
		System.out.println(list);
		
		
	}

}
