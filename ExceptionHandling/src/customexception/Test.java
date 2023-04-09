package customexception;
/* Checkedexception and Unchecked exection,
 Checkedexception are those exception , in which compiler automatically, explict that this will result as exception, 
 so we need to handle those excetption before execution, otherwise code will not be compile.
 Every subclass of Exception class , except RuntimeException are CHeckedException
 
 UnChecked Exception are those Exception, in which compiler, doesnot say anthing, we have to do it ourself,
 and it is normally , seen at the run time, Every subclass of RuntimeException are Unchecked Exception
 
 */



public class Test {
	public static void main(String[] args)  {
		
//		throw new UncheckedCustomExceoption("Custom exception");
		try
		{
			throw new CheckedCustomException("Custom exception");

		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
	}

}
