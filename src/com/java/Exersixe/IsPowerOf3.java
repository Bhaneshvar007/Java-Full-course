package com.java.Exersixe;

import java.util.Scanner;

public class IsPowerOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number : ");
		int n = sc.nextInt();
		boolean check = false;
		
		// Program for is power of three
//		while (n % 3 == 0) {
//			n /= 3;
//		}
//
//		if (n == 1) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		
		// Program for perfact cube(3);
		
//		for (int i = 1; i <= n; i++) {
//			if (n == i * i * i) {
//				check = true;
//			}
//		}
//		if (check == true) {
//			System.out.println("Perfact Cube");
//		} else {
//			System.out.println("Not a perfact Cube");
//		}
		
		// Using mathFunction;
		 if(Math.cbrt(n)==(int)(Math.cbrt(n))) {
	    	 System.out.println("Yes");
	     }
	     
	     else {
	    	 System.out.println("No");
	     }
	}
}
