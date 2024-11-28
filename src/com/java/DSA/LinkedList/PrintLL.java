package com.java.DSA.LinkedList;

import java.util.*;

public class PrintLL {
	Node head;
	private int size;

	PrintLL() {
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

	public void InsertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

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

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		PrintLL obj = new PrintLL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Define your linked list size : ");
		int n = sc.nextInt();
		// In Increasing order
		obj.InsertFirst(1);
		for(int i=2;i<=n;i++) {
			obj.InsertLast(i);
		}
		obj.display();
		
		// In Deacresing order printing
//		System.out.println();
//		for(int i=n;i>=1;i--) {
//			obj.InsertLast(i);
//		}
 		
	}
}
