package com.java.Exersixe;

import java.util.Scanner;

public class LeepYear {
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0) {
			System.out.println("Leep Year");
		} else {
			System.out.println("Not a leep year");
		}
	}
}
