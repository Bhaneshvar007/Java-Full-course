package com.java.Exersixe.LeetCodeProblem;

import java.util.Scanner;

// Check the number is palindrome are if the number is palindrome take the true O/P else false O/P
 
public class Problem09 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Number : ");
	String str=sc.next();
 	String str1="";
	for(int i=str.length()-1;i>=0;i--) {
		str1+=str.charAt(i);
	}
 	if(str.equals(str1)) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
 }
}
