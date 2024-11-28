package com.java.DSA.Stack;

import java.util.*;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
//		Collections.reverse(s);// using java collection

		// Using another stack
		Stack<Integer> t = new Stack<>(); // O(n);
		while (s.size() > 0) {
			t.push(s.peek());
			s.pop();
		}
		while (t.isEmpty() == false) {
			System.out.print(t.peek() + " ");
			t.pop();
		}
	}

}
