package com.java.Exersixe.LeetCodeProblem;

// Add two binary number for example a="11" b="01" O/P => "100";

import java.util.*;

public class Problem67 {

	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a and b : ");
		String a = sc.next();
		String b = sc.next();
		
		int num1=Integer.parseInt(a,2);
		int num2=Integer.parseInt(b,2);
		
		int sum=num1+num2;
		
	 String res=Integer.toBinaryString(sum);
	 System.out.println(res);

	}
}