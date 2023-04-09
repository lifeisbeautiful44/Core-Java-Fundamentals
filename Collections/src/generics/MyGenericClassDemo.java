package generics;

public class MyGenericClassDemo<T> {
	
	T obj;
	
	public MyGenericClassDemo(T obj) {
		this.obj = obj;
	}
	
	public void displayObject()
	{
		System.out.println("The type of Object is: " + obj.getClass().getName());
	}
	
	public T getObject()
	{
		return obj;
	}
	

	

}
