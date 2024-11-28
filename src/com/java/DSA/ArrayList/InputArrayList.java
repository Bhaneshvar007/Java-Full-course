package com.java.DSA.ArrayList;

import java.util.*;

public class InputArrayList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	System.out.println();
	int n= sc.nextInt();
	
	for(int i=0;i<n;i++) {
		list.add(sc.nextInt());
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=list.get(i);
	}
	System.out.println(sum);
	System.out.println(list);
}
}
