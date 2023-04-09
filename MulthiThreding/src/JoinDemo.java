import java.util.Scanner;
/*
Here, main method is a single thread , and we have used and another thread called run();
Here, if we want the sum of the n number, 
Then, 
When the program execute, the sum of the n numbers will be exectued by the main, 
before, it gets the sum of n number , which is calucalted in new thread in run() method,

So, to stop the exectution of the main thread , before the calculation of n numbers,
we use join() method , so that , the run method, executes completely, 
and then only the main thread , will exectue the instructions after that ,
for example here,
		System.out.println("The sum of the " + JoinDemo.n + " numbers is " + JoinDemo.sum);
		this will only execute after the run method is completley executed .
*/
public class JoinDemo extends Thread {
	static int n, sum = 0;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Enter the N number ");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();
		   

		JoinDemo j = new JoinDemo();
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("The sum of the " + JoinDemo.n + " numbers is " + JoinDemo.sum);
		scanner.close();
		long end = System.currentTimeMillis();
		System.out.println("The total time taken to complete the exectution is "+ (end-start)/1000 + " seconds");
		
	}
	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum = JoinDemo.sum + i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(JoinDemo.sum);
		}
	}
}
