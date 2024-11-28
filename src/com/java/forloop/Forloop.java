package com.java.forloop;

public class Forloop {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					System.out.print("* ");
				}
				 System.out.println("");
			}

			System.out.println(" ");

		}
	}
}
