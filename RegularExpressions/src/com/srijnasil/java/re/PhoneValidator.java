package com.srijnasil.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher matcher = pattern.matcher("9748285695");
		
		
		if(matcher.matches())
		{
			System.out.println("Valid phone number.");
		}
		else {
			System.out.println("In-valid phone number");
		}
		

	}

}
