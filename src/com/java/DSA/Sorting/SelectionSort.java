package com.java.DSA.Sorting;

import java.util.Scanner;

public class SelectionSort {
	 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your array size : ");
			int n = sc.nextInt(); // Size of array;

			int arr[] = new int[n];
			System.out.print("Enter your array element : ");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			 
			System.out.println();
			for(int i=0;i<n;i++) {
				int minInd=i;
				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[minInd]) {
						minInd=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[minInd];
				arr[minInd]=temp;
			}
			System.out.print("After Printing an sort array element : ");
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}


