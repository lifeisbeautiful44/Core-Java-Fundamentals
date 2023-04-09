package com.srijnasil.java.re;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[abc]+", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "4abcs1"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,6}", "ssb123"));

		
	}

}
