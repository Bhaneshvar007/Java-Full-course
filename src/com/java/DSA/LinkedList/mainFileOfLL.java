package com.java.DSA.LinkedList;

import java.util.*;

public class mainFileOfLL {
	Node head;
	private int size;

	mainFileOfLL() {
		this.size = 0;
	}

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

// insert first
	public void InsertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

// insert last 
	public void InsertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = newNode;
		size++;
	}

	// Delete First element from the list.

	public void deleteFirst() {
		if (head == null)
			return;

		head = head.next;
		size--;
	}

	// Delete last element from the list
	public void deletelast() {
		if (head == null)
			return; // 0th element
		size--;
		if (head.next == null) { // 1 element
			head = null;
			return;
		}
		Node prev = head;
		Node tail = head.next;

		while (tail.next != null) {
			tail = tail.next;
			prev = prev.next;
		}
		prev.next = null;
	}

	public void InsertMid(int index, int data) {
		Node newNode = new Node(data);
		if (index < 0 || index > size) {
			return;
		}

		if (index == 0) { // insert first condition
			newNode.next = head;
			head = newNode;
			size++;
		}

		if (index == size) { // insert last condition
			if (head == null) {
				head = newNode;
				return;
			}
			Node tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
			size++;
		}

		// Mid insert condition.
		Node prev = head;
		for (int i = 0; i < index - 1; i++) // Element ek index aage move kar rha so index-1;
		{
			prev = prev.next;
		}

		newNode.next = prev.next; // new node ke next ko prev ke next se point karana hai
		prev.next = newNode; // prev ke node ko new node se connect karna hai.
		size++;

	}

	// delete element at the mid position;

	public void deleteMid(int index) {
		if (index > size || index < 0)
			return; // index out off bound error.

		// delete first;

		if (index == 0) {
			if (head == null)
				return;

			head = head.next;
			size--;
		}

		// delete last;

		if (index == size) {
			if (head == null)
				return;

			size--;
			if (head.next == null) {
				head = null;
				return;
			}
			Node prev = head;
			Node tail = prev.next;

			while (tail.next != null) {
				tail = tail.next;
				prev = prev.next;
			}
			prev.next = null;
		}

		Node prev = head;
		for (int i = 0; i < index - 1; i++) {
			prev = prev.next;
		}

		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		size--;
	}

	// Print element
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		mainFileOfLL obj = new mainFileOfLL();
		Scanner sc = new Scanner(System.in);
//		System.out.print("Define your linked list size : ");
//		int n = sc.nextInt();
//		// In Increasing order
//		for (int i = 1; i <= n; i++) {
//			obj.InsertLast(i);
//		}
//		
//		System.out.print("Which node you want to delete ? :");
//		int k = sc.nextInt();
//
////		obj.deleteFirst();
////		obj.deletelast();
////		obj.InsertMid(k, 100);
		obj.InsertFirst(1);
		obj.InsertFirst(1);
		obj.display();

	}
}
