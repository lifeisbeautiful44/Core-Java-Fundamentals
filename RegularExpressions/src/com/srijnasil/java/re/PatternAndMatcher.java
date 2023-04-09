package com.srijnasil.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("srijansil");
		Matcher matcher = pattern.matcher("srijansilboharaisajavadevleopersrijansilboharaisliving");
		
		while(matcher.find())
		{
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println(matcher.group());
		}

	}

}



