package com.java.DSA.TWOdArray;

import java.util.Scanner;

public class Rotatemetrix90deg {
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

       // tranpose metrix
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < cols; j++) {
				if (i < j) {
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					mat[j][i] = temp;
				}

			}
		}
		
		
		// for n*n
		
		for(int i=0;i<rows;i++) {
			int j=0,k=mat.length-1;
			while(j<k) {
				int temp=mat[i][j];
				mat[i][j]=mat[i][k];
				mat[i][k]=temp;
			}
			j++;
			k--;
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat[i][j] + " "); // for printing the matrix |
			}
			System.out.println();
		}

	}
}
