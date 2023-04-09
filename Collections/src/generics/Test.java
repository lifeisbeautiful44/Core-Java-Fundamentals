package generics;

public class Test {

	public static void main(String[] args) {
	
		MyGenericClassDemo<String> s = new MyGenericClassDemo<>("Srijansil");
		s.displayObject();
		System.out.println(s.getObject());
		
		MyGenericClassDemo<Integer> i = new MyGenericClassDemo<>(44);
		i.displayObject();
		Integer object = i.getObject();
		System.out.println(object);
		

	}

}
