package com.java.forloop;

import java.util.Scanner;

public class Tabel {
public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter the any number : ");
	int n = obj.nextInt();
	System.out.println("The number " + n + " table is :");
	for(int i=1;i<=10;i++) {
		System.out.println(i + " * " + n + " = " + i*n);
	}
}
}

