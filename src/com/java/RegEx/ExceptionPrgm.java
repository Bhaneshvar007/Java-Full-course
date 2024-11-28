package com.java.RegEx;

public class ExceptionPrgm {
public static void main(String[] args) {
	try {
		String s="Abhishek";
		System.out.println(s.charAt(10));
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Error Raised");
	}
	finally {
		System.out.println("Chala ja BSDK ");
	} 
	 
}
}
