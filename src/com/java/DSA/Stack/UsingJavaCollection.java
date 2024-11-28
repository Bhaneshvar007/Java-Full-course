package com.java.DSA.Stack;

import java.util.*;

public class UsingJavaCollection {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.peek());   // visit last element
//		s.pop();
		System.out.println(s.size());
		
		while(s.isEmpty() == false) {
			System.out.print(s.peek() + " ");
			s.pop();
		}
	}
}
