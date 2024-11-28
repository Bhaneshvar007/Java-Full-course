package com.java.Exersixe;

import java.util.*;

public class AutomorficNumber {
	
	public static boolean AutomorCheck (int n ,int sqr) {
		while(n>0) {
			  if(n%10!=sqr%10) {
				  return false;
			  }
			  n=n/10;
			  sqr=sqr/10;
		  }
		return true;
 	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Box : ");
		int n = sc.nextInt();
		int sqr = n * n;
		System.out.println(AutomorCheck(n,sqr));
 
	}
}
