package com.srijnasil.java.re;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {

	public static void main(String[] args) {

		File directory = new File("/home/life_is_beautiful/Srijansil/Java/NewVersionJava/RegularExpressions/textfiles");

		String[] FileNames = directory.list();

		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.]txt");
		int count = 0;

		for (String FileName : FileNames) {
			Matcher matcher = pattern.matcher(FileName);

			if (matcher.matches()) {
				count++;
				System.out.println(FileName);
			}
		}

		System.out.println("Number of text files is: " + count);

	}

}
