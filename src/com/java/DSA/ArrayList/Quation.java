package com.java.DSA.ArrayList;

import java.util.*;

public class Quation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	System.out.println();
	int n= sc.nextInt();
	
	for(int i=0;i<n;i++) {
		list.add(sc.nextInt());
	}
	
	list.add(1,3);
	list.add(5,6);
	list.add(7,9);
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i) + " ");
 	}
}
}
