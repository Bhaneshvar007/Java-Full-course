package com.java.VVVVVVVIMPPPP;

import java.util.*;

public class ImplementQueueUsing2Stack {
	static public class QueueIn {
		Stack<Integer> s1 = new Stack<>(); // s1 is queue and main stack
		Stack<Integer> s2 = new Stack<>(); // copy stack.
		
		public boolean isEmpty() {
			return s1.isEmpty();
		}
		
		public void add(int data) {  // insert the data in the given queue.
			while(s1.size()>0) {
				s2.push(s1.pop());
			}
			s1.push(data);  
			while(s2.size()>0) {
				s1.push(s2.pop());
			}
		}

		public int peek() {
			return s1.peek();
		}
		
		public int remove() {
			return s1.pop();
		}
	}
	
	public static void main(String[] args) {
		QueueIn Q = new QueueIn();
		Q.add(1);
		Q.add(2);
		Q.add(3);
		Q.add(5);
		System.out.println(Q.peek());
		while(!Q.isEmpty()) {
			System.out.print(Q.remove() + " , ");
		}
	}
}
