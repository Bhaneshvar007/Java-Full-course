package com.java.RegEx;

import java.util.regex.*;

public class StrMatch {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("abhi");
		Matcher m = p.matcher("Abhishek");
		boolean found = m.find();
		
		if(found==true) {
			System.out.println(true);
		}
		
		else {
			System.out.println(false);
		}

	}

}
