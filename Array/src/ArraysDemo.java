
public class ArraysDemo {
	
	public static void main(String[] args) {
		
		// various type to create array.
		//type 1.
		int arr[] = {10,20,30,40,50};
		arr[0] = 10 ;
		//type 2.
		int arr1[] = new int[6];
		arr1[5] = 15;
		
		System.out.println(arr[0]);
		System.out.println(arr1[5]);
		
		//for each loop
		for(int elements : arr1)
		{
			System.out.println(elements);
		}
         //  int rr3[] = new int[] {1,2,3};
      
		
		
		
	}

}
