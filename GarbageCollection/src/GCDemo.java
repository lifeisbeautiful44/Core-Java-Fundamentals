
public class GCDemo {
	
	int objId;
	
	public GCDemo(int id ) {
		this.objId = id;
		System.out.println("Created "+ id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GCDemo(1);
		new GCDemo(2);
		
		for (int i = 0; i < 100; i++) {
			System.gc();  // requesting JVM for the garbage collection ...
			
		}
		

//	for (int i=1; i <=5000;i++)
//	{
//		new GCDemo(i);
//	}
//
	}
	
    @Override
    protected void finalize() throws Throwable {
    
    	System.out.println( " Finalized " + objId);
    }

}
