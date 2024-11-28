package com.java.Exersixe;

import java.util.Scanner;

public class NearestPerfactSequre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number prime or not : ");
		int n = sc.nextInt();
		// 1. Way 
		
//		while (n != 0) {
//			if (Math.sqrt(n) == (int) Math.sqrt(n)) {
//				System.out.println(n);
//				break;
//
//			} else {
//				n--;
//			}
//		}
		
//		2. Secound way;
		
		int root = (int) Math.sqrt(n);
		System.out.println(root*root);

	}
}