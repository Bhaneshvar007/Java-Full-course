package com.java.Exersixe;

import java.util.Scanner;

public class QuabraticEquastion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your equation : ");
		String eq = sc.next();
		int a, b, c;
		String[] parts = eq.split("(?=[-+])");
		a = Integer.parseInt(parts[0].split("x\\^2")[0]);
		b = Integer.parseInt(parts[1].split("x")[0]);
		c = Integer.parseInt(parts[2].split("=")[0]);

		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);
		System.out.println("The value of c is : " + c);

		double discriminant = b * b - 4 * a * c;

		if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("Roots are real and different:");
			System.out.println("Root 1 = " + root1);
			System.out.println("Root 2 = " + root2);
		} else if (discriminant == 0) {
			double root = -b / (2 * a);
			System.out.println("Roots are real and same:");
			System.out.println("Root = " + root);
		} else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("Roots are complex and different:");
			System.out.println("Root 1 = " + " + " + imaginaryPart + "i");
			System.out.println("Root 2 = " + " - " + imaginaryPart + "i");
		}

	}
}
