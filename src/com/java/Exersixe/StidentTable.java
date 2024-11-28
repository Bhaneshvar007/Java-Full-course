package com.java.Exersixe;

import java.util.Scanner;

public class StidentTable {

	public static void Exam(int m, int p, int c) {
		int avg = (m + p + c) / 3;
		int per = (m + p + c) * 100 / 300;
		System.out.println("avg :" + avg);
		System.out.println("per :" + per);
		if (avg >= 40) {
			if (per >= 33) {
				System.out.println("Student pass");
			} else {
				System.out.println("fail");
			}
		} else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int m = sc.nextInt();
		int p = sc.nextInt();
		int c = sc.nextInt();
		Exam(m, p, c);
	}
}
