package com.srijnasil.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+$");
		
		Matcher matcher = pattern.matcher("srijansil@gmail.com");
		if(matcher.matches())
		{
			System.out.println("Valid email_id");
		}
		else {
			System.out.println("In-valid email_id");
		}
		
		


	}

}
