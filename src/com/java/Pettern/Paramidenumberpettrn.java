package com.java.Pettern;

import java.util.Scanner;

public class Paramidenumberpettrn {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println();
	int n=sc.nextInt() ,c=0;
	for (int i = 0; i <= n; i++) {
		for (int j = n - i; j >= 0; j--) {
			System.out.print(" ");
		}
		for (int j = 0; j <= i; j++) {
			c=c+1;
			System.out.print(" "+c);
		}
		System.out.println();
	}
}
}
