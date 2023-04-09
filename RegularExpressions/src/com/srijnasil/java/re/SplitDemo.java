package com.srijnasil.java.re;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		
		//By using our pattern to check the delimeter and remove the space.
		Pattern pattern = Pattern.compile("\\s");
		String[] words = pattern.split("hello how are man?");
		
		for (String word : words) {
			System.out.println(word);
		}
		
		//By using String
		String st = "hello how are you ";
		String[] split = st.split("[ ]");
		
		for (String string : split) {
			System.out.println(string);
		}
		

	}

}
