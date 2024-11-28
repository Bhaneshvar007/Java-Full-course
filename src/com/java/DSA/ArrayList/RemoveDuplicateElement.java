package com.java.DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, i);
		}

		int ArrayListhash[] = new int[max + 1];
		for (int i = 0; i < ArrayListhash.length; i++) {
			ArrayListhash[list.get(i)]++;
		}
		
		for(int i=0;i<ArrayListhash.length;i++) {
			if(ArrayListhash[list.get(i)] == 2) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}