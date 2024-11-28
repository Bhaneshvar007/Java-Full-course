package com.java.Exersixe;

import java.util.Scanner;

// PalindromeNumber = Eaise number jinhe age se pado ya piche se wo same hote hai jaise 121.123321,352253....;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter any type of number : ");
			int n = sc.nextInt();
			int temp, rev = 0, rem;
			temp = n;
			while (n > 0) {
				rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
				System.out.println(rev);
			}
			if (temp == rev) {
				System.out.println("Palindrome Number");
			}

			else {
				System.out.println("NOt A Palindrome Number");
			}
		}
	}
}
