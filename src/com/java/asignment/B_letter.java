package com.java.asignment;

public class B_letter {
	public static void main(String[] args) {
		int height = 7; // Adjust the height as needed

		for (int row = 1; row <= height; row++) {
			for (int col = 1; col <= height; col++) {
				if (col == 1 || col == height || (row == 1 && col < height / 2)
						|| (row == height / 2 && col < height / 2) || (row == height && col < height / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
