package com.java.DSA.ArrayDsa;

public class TopointerArrayReverse {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		// Rotate aray using to pointer aproach .

		int i = 0, j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + ",");
		}
	}

}
