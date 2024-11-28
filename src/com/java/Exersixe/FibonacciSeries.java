package com.java.Exersixe;

public class FibonacciSeries {
	public static void Feb() {
		int a = 0;
		int b = 1;
		int c,i=0;

		System.out.print(a + "," + b);
		// using for loop
		for (i = 1; i <= 10; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print("," + c);
		}
		
		// Using While loop;
		
		while(i<=10) {
			c=a+b;
			a=b;
			b=c;
			System.out.print("," + c);
			i++;
		}
	}

	public static void main(String[] args) {
		Feb();
	}
}
