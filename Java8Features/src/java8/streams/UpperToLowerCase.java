package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("SRIJAN");
		l1.add("SIL");
		l1.add("BOHARA");
		System.out.println(l1);

		List<String> collect = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());

		System.out.println(collect);

	}

}
