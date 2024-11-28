package com.java.DSA.LinkedList;

import java.util.*;

public class LL {
	private int size;
	Node head;

	LL() {
		this.size = 0;
	}

	public class Node { // Inner class
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Method For Insert First.
	public void InsertFirst(int data) {
		Node nNode = new Node(data);
		nNode.next = head;
		head = nNode;
		size++;

	}

	// Method For Insert last.
	public void InsertLast(int data) {
		Node nNode = new Node(data);
		if (head == null) {
			head = nNode;
			return;
		}
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = nNode;
		size++;
	}

	// Method For Insert Mid
	public void InsertMid(int ind, int data) {
		Node nNode = new Node(data);
		if (ind < 0 || ind > size)
			return;

		// InsertFirst condition;
		if (ind == 0) {
			nNode.next = head;
			head = nNode;
			size++;
		}

		// Insert Last condition;
		if (ind == size) {
			if (head == null) {
				head = nNode;
				return;
			}
			Node tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = nNode;
			size++;
		}

		// Insert Mid
		Node prev = head;
		for (int i = 0; i < ind - 1; i++) {
			prev = prev.next;
		}
		nNode.next = prev.next;
		prev.next = nNode;
		size++;
	}

	// Method for delete first;
	public void deleteFirst() {
		if (head == null)
			return;
		head = head.next;
		size--;
	}

	// Method for delete Last
	public void deleteLast() {
		if (head == null)
			return;
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node prev = head;
		Node tail = head.next;
		while (tail.next != null) {
			prev = prev.next;
			tail = tail.next;
		}
		prev.next = null;
	}

	// Method for delete Mid;
	public void deleteMid(int ind) {
		if (ind < 0 || ind > size)
			return;

		// first
		if (ind == 0) {
			if (head == null)
				return;
			head = head.next;
			size--;
		}
        // last
		if (ind == size) {
			if (head == null)
				return;
			size--;
			if (head.next == null) {
				head = null;
				return;
			}
			Node prev = head;
			Node tail = head.next;
			while (tail.next == null) {
				tail = tail.next;
				prev = prev.next;
			}
			prev.next = null;
		}
        //mid
		Node prev = head;
		for (int i = 0; i < ind - 1; i++) {
			prev = prev.next;
		}
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		size--;
	}

	// Display function;
	public void Display() {
		Node temp = head;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.print("]");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LL list = new LL();
		System.out.print("Enter a linked list size : ");
		int n = sc.nextInt();
//		list.InsertFirst(100);
		for (int i = 1; i <= n; i++) {
			list.InsertLast(i);
		}
		list.InsertMid(5, 600);
		list.deleteFirst();
		list.deleteLast();
		list.deleteMid(5);
		list.Display();
	}
}
