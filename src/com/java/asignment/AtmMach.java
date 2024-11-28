package com.java.asignment;

import java.util.Scanner;

public class AtmMach {
	public static void main(String[] args) {
		int amount = 10000, pinNum = 1221, newPin;
		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("");
			System.out.println("Welcome to ' SBI ' Atm");
			System.out.println("**************************");
			System.out.println("1.Withrow Money");
			System.out.println("2.Deposite Money");
			System.out.println("3.Check Money");
			System.out.println("4.Reset pin");
			System.out.print("Do you want to perform any operation : ");
			int n = sc.nextInt();

			switch (n) {

			// Withdrowal money.

			case 1: {
				System.out.println("Withdrowal status");

				System.out.print("Enter your 4 digit atm pin :");
				int pin = sc.nextInt();
				if (pin == pinNum) {
					System.out.println("Enter your withrowal amount : ");
					int amt = sc.nextInt();
					amount = amount - amt;

					System.out.println("Do you want to see your balance: ");
					System.out.println("1. Yes");
					System.out.println("2. No");

					int blnc = sc.nextInt();
					switch (blnc) {
					case 1:
						System.out.println("Your current balance is : " + amount);
						break;

					case 2:
						System.out.println("Thank your");
						break;

					default:
						System.out.println("Invalid massage");
					}

				} else {
					System.out.println("Please enter a valid pin");
				}
				break;
			}

			// Deposite money .
			case 2: {
				System.out.println("Deposite status");

				System.out.print("Enter your Acc number :");
				long acc = sc.nextLong();

				System.out.print("Enter your phone number :");
				long PhN = sc.nextLong();

				if (acc < 10 && PhN <= 10) {
					System.out.print("Enter your Deposite money  :");
					int Dmoney = sc.nextInt();

					amount = amount + Dmoney;
					System.out.println(amount);
				}
				break;
			}

			// Balance check status.
			case 3: {
				System.out.println("Account Status");
				System.out.print("Enter your 4 digit atm pin :");
				int pin = sc.nextInt();
				if (pin == pinNum) {
					System.out.println("Your current balance is : " + amount);
				} else {
					System.out.println("Please enter a valid pin");
				}
				break;
			}

			case 4:
				System.out.println("Reset Status");

				System.out.print("Enter your phone number :");
				long PhN = sc.nextLong();

				if (PhN >= 10) {
					System.out.print("Reset your Pin ");
					newPin = sc.nextInt();

					System.out.print("Conform your Pin ");
					newPin = sc.nextInt();

					System.out.print("Enter your old ");
					int CPin = sc.nextInt();

					if (CPin == pinNum) {
						pinNum = newPin;
						System.out.println("Your Pin succesfully changed");
					} else {
						System.out.println("Plese enter currect money");
					}

				} else {
					System.out.println("lkdhg");
				}
				break;

			default: {
				System.out.println("Please choose a valid option");
			}
			}
		}
	}
}
