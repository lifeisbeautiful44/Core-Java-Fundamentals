package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {

          List<Integer> l1 = new ArrayList<>();
          
          for(int i=10; i>=0; i--)
          {
        	  l1.add(i);
          }
          
          System.out.println(l1);
          
        /*  List<Integer> l2 = new ArrayList<>();
          for (Integer number : l1) {
			if(number % 2 ==0)
			{
				l2.add(number);
			}
		}
		*/
          
          List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        
          System.out.println(l2);
          
          long count = l1.stream().filter(i->i%2==0).count();   //using count
          System.out.println(count);
          
          Comparator<Integer> comp = (num1, num2)->num1.compareTo(num2);

          
           List<Integer> collect = l1.stream().filter(i->i%2==0).sorted(comp).collect(Collectors.toList());  //using sort
          System.out.println(collect);
          
          
          Integer max = l1.stream().max(comp).get();  //using maximum
          System.out.println(max);
          
          Integer min = l1.stream().min(comp).get();  //using minimum
          System.out.println(min);
          
          l1.stream().forEach(num->System.out.println(num));
         


		
	}

}
