package java8.lambda.methodref.constructors;


public class Test {

	public static void main(String[] args) {

		MyFunctionalInterfaces f = s -> new MyCLass(s);
		f.get("Using lambda");
		
		MyFunctionalInterfaces f2 = MyCLass::new;
		f2.get("Using Constructor Mapping");
		
		
		
		
		
	}

}
