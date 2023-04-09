

// Final class, cannot be inherited or extended.
// FInal method cannot be overridden.
// Final variable value cannot be changed.
// We can use final and static as a constant.
public final class FinalConcepts {
	
	
	 static final   float pi = 3.17f;
	final float pi1 = 3.12f;
	
	
	public static void main(String[] args) {
		final  FinalConcepts fc = new FinalConcepts();
		System.out.println(fc.pi1);
		

//		fc = new FinalConcepts();  -> Final object reference value cannot be changed
//		fc.pi = 2.4f;  ->             Final variable cannot be assigned
		System.out.println(FinalConcepts.pi);
	}
	

}
