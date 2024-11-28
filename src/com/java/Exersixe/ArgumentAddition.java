package com.java.Exersixe;

import java.util.Scanner;

public class  ArgumentAddition {
	
	public static void add(int a , int b , int c) {
		int sum=a+b+c;
		System.out.println("Sum is : "+sum);
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first Number : ");
	int x = sc.nextInt();

	System.out.print("Enter secound Number : ");
	int y = sc.nextInt();

	System.out.print("Enter third Number : ");
	int z = sc.nextInt();
	add(x,y,z);
}
}
