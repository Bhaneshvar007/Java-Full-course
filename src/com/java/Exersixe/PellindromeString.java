package com.java.Exersixe;

import java.util.Scanner;

public class PellindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String s1 = "";
		// It reverse String
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		
 		boolean check = false;
 		
//		for (int i = 0; i < s.length(); i++) {
//			if (s1.charAt(i) == s.charAt(i)) {
//				check = true;
//			}
//		}
//		
//		if (check == true) {
//			System.out.println("Pelindrome");
//		}
//
//		else {
//			System.out.println("Not a Pelindrome");
//		}
 		
 		// Using string builder function
 		
 		if(s.equals(s1)) {
			System.out.println("Pelindrome");
 		}
 		
 		else {
			System.out.println("Not a Pelindrome");
 		}
 		
	}
}
