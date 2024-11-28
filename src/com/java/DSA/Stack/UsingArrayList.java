package com.java.DSA.Stack;

import java.util.*;

public class UsingArrayList {
	ArrayList<Integer> list = new ArrayList<>();

	public void push(int data) { // Insert the element
		list.add(data);
	}

	public int pop() {
		if (list.size() == 0)
			return -1;
		int el = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return el;

	}

	public int size() {
		return list.size();
	}

	public int top() {
		return list.get(list.size() - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UsingArrayList obj = new UsingArrayList();
		System.out.println("Enter your stack Size : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			obj.push(i);
		}
		
		while(obj.size()>0) {
			System.out.print(obj.top() + " ");
			obj.pop();
		}
		
		// Reverse a stack
	}
}
