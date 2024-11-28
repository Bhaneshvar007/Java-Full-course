package com.java.DSA.Recursion;

import java.util.*;
public class RecursionFirst {
	
public static void printRecursion(int n) {
	if(n==0) return ;  // base case
	
// 	System.out.print(n + " "); // print n to 1 // agar calling ke pahle print karaye to 5 -> 4 -> 3 -> 2 -> 1
	
	printRecursion(n-1);  // Single+tail recursion . && recursive case;
//	System.out.println();
	System.out.print(n + " "); // print 1 to n  // agar print ke baad call karaye to  1 -> 2 -> 3 -> 4 -> 5
	printRecursion(n-1);  // Single+tail recursion . && recursive case;
			
 }
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number you can print : ");
	int n = sc.nextInt();
	printRecursion(n);
}
}
