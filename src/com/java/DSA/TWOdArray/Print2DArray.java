package com.java.DSA.TWOdArray;

import java.util.Scanner;

public class Print2DArray {
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

//	boolean ch=true;
//	
//	for(int i=0;i<rows;i++) {
//		for(int j=0;j<cols;j++) {
////			System.out.print(mat[i][j] + " "); // for printing the matrix |
//			if(i!=j&&mat[i][j]!=0) {
//				ch=false;
//			}
//			 
//		}
// 	}

		// Trinspose of a metrix; mat[i][j] = mat[j][i];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i < j) {
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					mat[j][i] = temp;
				}

			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat[i][j] + " "); // for printing the matrix |
			}
			System.out.println();
		}

	}
}
