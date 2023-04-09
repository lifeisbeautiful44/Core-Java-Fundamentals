// THrow and throws,
// throws is generally used to suppress the exception, without usung try and catch,
// where as throws is generally used to explicilty throw excpetion or for the custom exception

public class ThrowAndThrows {

	public static void main(String[] args) {
		int age =20;
		boolean crime = true;
		
      if(age < 18)
      {
    	  try {
        	  throw new AgeError("In valid age");
    	  }
    	  catch(AgeError e)
    	  {
    		  System.out.println(e);
    	  }
    	  
      }
      
      else if(crime == true)
      {
    	  try {
    		  throw new CrimeEffortError("Criminal Activity involment is not Allowd.");
    	  }
    	  catch(CrimeEffortError e)
    	  {
    		  System.out.println(e);
    	  }
      }
      else {
    	  System.out.println("You can vote");
      }
      
      
     
         
        
         
		
		
		
		
	

}
}

