package com.java.Exersixe;

public class OneTo100PrimeNum {
	public static void main(String[] args) {
		int i, j;
		for (i = 2; i <= 100; i++)

		{
			int t = 0;
			for (j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					t = t + 1;
				}
			}
			if (t == 0) {
				System.out.print(i + " ");
			} else {
				t = 0;
			}

		}
	}
}
