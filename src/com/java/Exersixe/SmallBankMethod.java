package com.java.Exersixe;

import java.util.Scanner;

public class SmallBankMethod {
	static int avlBal = 10000;

	public static void widMeth(int widBal) {
		avlBal = avlBal - widBal;
	}

	public static void Deposite(int DepBal) {
		avlBal = avlBal + DepBal;
	}

	public static void Checkbal(int avlbal) {
		System.out.println("Your available balance is : " + avlbal);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int depBal, widBal;
		while (true) {
			System.out.println("Press 1 for Withdrow balance");
			System.out.println("Press 2 for Deposite balance");
			System.out.println("Press 3 for Check balance");
			int n = sc.nextInt();

			switch (n) {
			case 1: {
				System.out.println("Enter your withrow amount");
				widBal = sc.nextInt();
				widMeth(widBal);
				break;
			}

			case 2: {
				System.out.println("Enter your Deposite amount");
				depBal = sc.nextInt();
				Deposite(depBal);
				break;
			}
			case 3: {
				System.out.println("Enter your withrow amount");
				Checkbal(avlBal);
				break;
			}

			default:
				System.out.println("Invalid command");
			}
		}
	}
}
