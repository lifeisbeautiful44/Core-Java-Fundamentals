package generics.wildcards;

import java.util.ArrayList;

import generics.restrictions.RunnableAndComaprable;

public class WildCardParams {
	
	public void myMethod(ArrayList<? extends Thread> s)  //wild card, and you can only add null in it.
	{
		s.add(null);
	//	s.add("Srijansil");
	}
	
	public static void main(String[] args) {
		WildCardParams wcp = new WildCardParams();
		wcp.myMethod(new ArrayList<RunnableAndComaprable>());
	}

}
