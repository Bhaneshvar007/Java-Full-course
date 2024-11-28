package com.java.DSA.TWOdArray;

import java.util.Scanner;

public class SpiralMetrixClass {
	
	public static void SpiralMetrixMeth(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		
		int topL=mat[0][0],topR=mat[0][n-1],botR=mat[n-1][n-1],botL=mat[n-1][0];
		for(int i=topL;i<topR-1;i++) {
			System.out.print(mat[topL][topR]);
		}
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input Row and colums : ");
	int rows = sc.nextInt();
	int cols = sc.nextInt();

	int[][] mat = new int[rows][cols];
	System.out.println("Enter the metrix elment : ");
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			mat[i][j] = sc.nextInt();
		}
	}
	SpiralMetrixMeth(mat);
	
}
}
