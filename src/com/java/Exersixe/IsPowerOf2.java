package com.java.Exersixe;

import java.util.Scanner;

public class IsPowerOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		boolean ch = true;
		if (num == 0) {
			ch = false;
		}	

//		while (num > 1) {
//			if (num % 2 == 1) {
//				ch = false;
//				break;
//			}
//			num /= 2;
//		}
//
//		if (ch == false) {
//			System.out.println("No");
//		}
//
//		else {
//			System.out.println("yes");
//		}
//		

//		Using BinaryApproach

		if ((num & (num - 1)) == 0) {
			System.out.println("yes");
		}

		else {
			System.out.println("No");
		}

	}
}
