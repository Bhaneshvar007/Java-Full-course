package com.java.Exersixe.csesProblem;

// input :-> gatttabs output :->3 Because t is repeated at 3 time as continuously

import java.util.Scanner;

public class RepetationProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		String str = sc.nextLine();

		int curRep = 1;
		int MaxRep = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				curRep++;
			} else {
				MaxRep = Math.max(MaxRep, curRep);
				curRep = 1;
			}
		}
		MaxRep = Math.max(MaxRep, curRep);
		System.out.println(MaxRep);

	}
}
