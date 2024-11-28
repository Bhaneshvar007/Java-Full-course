package com.java.Exersixe.csesProblem;

// odd condition aane par number ko 3 guna karke usme ek add karna ha and even aane par uska half karna hai.

import java.util.Scanner;

public class WeiredAlorithem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		System.out.print(num);
		while (num > 1) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			System.out.print(" -> " + num);
		}
	}
}