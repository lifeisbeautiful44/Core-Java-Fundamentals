package generics.wildcards;

import java.util.ArrayList;

public class Test {
	
	public void Dispaly(ArrayList<? super B> l)  // using super we can add 
	{
		l.add(null);
		l.add(new B());
		
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.Dispaly(new ArrayList<A>());  
		

		
		
	}

}
