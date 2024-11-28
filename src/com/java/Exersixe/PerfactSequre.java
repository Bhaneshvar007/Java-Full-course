package com.java.Exersixe;

import java.util.*;

public class PerfactSequre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		boolean check = false;

//      1. Using for loop

//		for (int i = 1; i <= n; i++) {
//			if (n == i * i) {
//				check = true;
//			}
//		}
//		if (check == true) {
//			System.out.println("Perfact Sequre");
//		} else {
//			System.out.println("Not a perfact Sequre");
//		}

		// 2. Using math function
 
//		if (Math.sqrt(n) == (int) Math.sqrt(n)) {
//			System.out.println("Yes");
//
//		} else {
//			System.out.println("Not a perfact secure");
//		}

		// 3 . Another way of math d=function
		if (Math.sqrt(n) - (int) Math.sqrt(n) == 0) {
			System.out.println("Yes");

		} else {
			System.out.println("Not a perfact secure");
		}

	}
}
