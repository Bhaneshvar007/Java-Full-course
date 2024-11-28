package com.java.DSA.LinkedList;

import java.util.Scanner;

public class InsertMid {
	private int size;
	Node head;

	InsertMid() {
		this.size = 0;
	}

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void InsertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
//			return;
		}
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = newNode;
		size++;
	}

	public void insertM(int i, int k) {
        
	}

	public void Display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InsertMid ob = new InsertMid();
		System.out.println("Enter Insert Element : ");
		int n = sc.nextInt();
//		int k = sc.nextInt();
		ob.InsertFirst(10);
		for (int i = 1; i <= n; i++) {
			ob.insertLast(i);
		}
		ob.insertM(5,100);
		ob.Display();
	}
}
