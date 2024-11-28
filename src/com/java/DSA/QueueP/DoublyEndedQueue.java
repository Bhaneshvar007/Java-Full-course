package com.java.DSA.QueueP;

import java.util.*;

public class DoublyEndedQueue {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(1);
		dq.add(2);
		dq.offer(3);
		while (!dq.isEmpty()) {
			System.out.print(dq.peek() + " ");
			dq.remove();

		}
		System.out.println();
		dq.add(10);
		dq.add(20);
		dq.offer(30);
		while (!dq.isEmpty()) {
			System.out.print(dq.peekLast() + " ");
			dq.removeLast();
		}
	}
}
