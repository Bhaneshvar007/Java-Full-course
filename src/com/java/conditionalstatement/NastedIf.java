package com.java.conditionalstatement;

public class NastedIf {
	public static void main(String[] args) {
		String Uname = "Abhishek@123";
		String Pass = "Abhi@123";

		if (Uname == "Abhishek@123") {
			System.out.println("UserName is correct");

			if (Pass == "Abhi@123") {
				System.out.println("Password is correct");
			}

			else {
				System.out.println("Password is in-correct");
			}
		}

		else {
			System.out.println("Username is in-correct");
		}
	}
}
