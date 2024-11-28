package com.java.DSA.QueueP;

public class UsingLLNode {
	static class Node {
		int data;;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	static class queue {
		static Node head = null;
		static Node tail = null;
		
		public boolean isEmpty() {
			return head == null && tail == null;
		}	
		
		public void add(int data) {
			Node newNode = new Node(data);
			if(tail==null) {
				tail = head = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
		
		public int remove() {
			if(isEmpty()) {
				return -1;
			}
			int front = head.data;
			// when single element id present in their list;
			if(head == tail) {
				tail = null;
			}
			head = head.next;
			return front;
		}
		
		public int peek() {
			if(isEmpty()) return -1;
			return head.data;
		}

	}
	
	public static void main(String[] args) {
		queue q = new queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		while(!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}
	}
}
