package com.java.Pettern;

public class StarPetrn {
public static void main(String[] args) {
	for(int i=0;i<=5;i++) {
		for(int j=i-1;j>=0;j--) {
			System.out.print("* ");
		}
		
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		
		System.out.println();
	}
	for(int i=4;i>=0;i--) {
		for(int j=i-1;j>=0;j--) {
			System.out.print("* ");
		}
		
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}
