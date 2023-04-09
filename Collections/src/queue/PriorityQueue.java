package queue;

/*
 Queue guratanes a natural ordering of the element in its first add,
 after the manipulation than it does not qives any guarantess,
 so we can use treeset, if we want the order every time.
*/
import java.util.Queue;

public class PriorityQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new java.util.PriorityQueue<>();
		System.out.println(q.peek());
	//	System.out.println(q.element());
		
		for(int i = 10; i< 20; i++)
		{
			q.offer(i);  //add elements to the queue
		}
		
	System.out.println(q);
	
	System.out.println(q.poll());  // retrieves and remove the first elements in the queue.
	System.out.println(q.remove(51));  //removes the 15,
	
	System.out.println(q);


		
	}

}
