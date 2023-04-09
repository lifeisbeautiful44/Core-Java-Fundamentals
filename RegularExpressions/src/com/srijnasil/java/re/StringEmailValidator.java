package com.srijnasil.java.re;

public class StringEmailValidator {

	public static void main(String[] args) {
		
		String email = "Srijansil_44@gmail.com";
		
		if(email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+$"))
		{
			System.out.println("Valid email_id");
		}
		else {
			System.out.println("Invalid email_id");
		}
		
	

	}

}
