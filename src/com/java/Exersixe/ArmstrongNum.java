package com.java.Exersixe;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter any number : ");
			int num = sc.nextInt();
			int t1 = num, t2 = num, arm = 0;
			int len = 0;
//			int multi = 1;

			// Count the number length;
			while (t1 != 0) {
				len = len + 1;
				t1 = t1 / 10;
			}

			// reverse Concept;

			while (t2 != 0) {
				int multi = 1;
				int rem = t2 % 10;

				for (int i = 1; i <= len; i++) {
					multi = multi * rem;
				}
				arm = arm + multi;
				t2 = t2 / 10;
			}

			if (num == arm) {
				System.out.println("Number is armstrong");
				break;
				
			}

			else {

				System.out.println("Number not a armstrong");
			}
		}
	}
}
