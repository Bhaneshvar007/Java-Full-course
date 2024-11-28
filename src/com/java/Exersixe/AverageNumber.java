package com.java.Exersixe;

import java.util.Scanner;

public class AverageNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first Number : ");
	int a = sc.nextInt();

	System.out.print("Enter secound Number : ");
	int b = sc.nextInt();

	System.out.print("Enter third Number : ");
	int c = sc.nextInt();
	
	float avg = (float)(a+b+c)/3;
	
	System.out.println(avg);
}
}
