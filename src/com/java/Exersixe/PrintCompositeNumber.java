package com.java.Exersixe;

public class PrintCompositeNumber {
	public static void main(String[] args) {
		int i, j;
		System.out.print("A Composite Number : ");
		for (i = 0; i <= 100; i++)
		{
			int t = 0;
			for (j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					t = t + 1;
				}
			}
			if (t == 0) {
				t = 0;
			}

			else {
				System.out.print(i + " ");
			}

		}
	}
}
