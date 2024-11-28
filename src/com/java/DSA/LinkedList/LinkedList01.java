package com.java.DSA.LinkedList;

public class LinkedList01 {
	Node head;
	private int size;

	LinkedList01() { // Default constructor
		this.size = 0;
	}

	public class Node { // inner class.
		int data;
		Node Next;

		Node(int data) {
			this.data = data;
			this.Next = null;
			size++;
		}
	}

	public void InsertFirst(int data) {
		Node newNode = new Node(data);
		newNode.Next = head;
		head = newNode;
		size++;
	}

	public void InsertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) { // When linked list is empty
			head = newNode;
			return;
		}
		Node tail = head;

		while (tail.Next != null) { // Jab tak node null( last node ) ko point na kare
			tail = tail.Next;
		}
		tail.Next = newNode;
		size++;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.Next;
		}
	}

	public static void main(String[] args) {
		LinkedList01 listObj = new LinkedList01();
		listObj.InsertFirst(5);
		listObj.print(); // 5
		System.out.println();
		
		listObj.InsertFirst(4);
 		listObj.InsertFirst(3);
		listObj.print(); // 3 4 5 
		System.out.println();
		
		listObj.InsertFirst(2);
		listObj.print();  // 2 3 4 5 
		System.out.println();
		
		listObj.InsertLast(1);
		listObj.print(); // 2 3 4 5 1
	}
}