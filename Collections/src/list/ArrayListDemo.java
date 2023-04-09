
package list;
import java.util.ArrayList;
import java.util.Iterator;

//using generic we can restrict the type of data that can go into a collection.


public class ArrayListDemo {
	
	public static void main(String[] args) {
//		ArrayList arrList = new ArrayList();
//		this to this
		ArrayList <Integer> arrList = new ArrayList<Integer>();
//		arrList.add(new Integer(20));
		arrList.add(10); // Autoboxing
		arrList.add(20);
		arrList.add(30);
		
		
		
		

		
		System.out.println(arrList);
		
		Iterator<Integer> itr = arrList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println( itr.next());
			itr.remove();
		}
	
		System.out.println(arrList);

	}

}
