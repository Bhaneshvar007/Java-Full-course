package com.java.conditionalstatement;

public class SwitchCase {
	public static void main(String[] args) {
		int days = 10;

		switch (days) {
		case 1:
			System.out.println("Mon");
			break;

		case 2:
			System.out.println("Tue");
			break;

		case 3:
			System.out.println("wed");
			break;

		case 4:
			System.out.println("The");
			break;

		case 5:
			System.out.println("Fri");
			break;

		case 6:
			System.out.println("Sat");
			break;

		case 7:
			System.out.println("Sun");
			break;

		default:
			System.out.println("Invalid Massage");

		}
	}
}
