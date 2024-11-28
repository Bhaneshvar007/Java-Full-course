package com.java.DSA.LinkedList;

public class ReverseLinkedList {
    Node head;
	private int size ;
	ReverseLinkedList(){
		this.size = 0;
	}
	public class Node{
		int data;
	    Node next;
	    Node(int x){
	    	this.data =x;
	    	this.next=null;
	    	size++;
	    }
	}
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node tail = head;
		while(tail.next !=null) {
			tail = tail.next;
		}
		tail.next = newNode;
		size++;
	}
	public void Insert(int data,int index) {
		Node newNode = new Node(data);
		if(index<0 || index >size) {
			return;
		}
		
		// InsertFirst
		if(index == 0) {
			newNode.next = head;
			head = newNode;
			size++;
		}
		
		// Insert last
		if(index == size) {
			if(head == null) {
				head = newNode;
				return;
			}
			Node tail = head;
			while(tail.next ==null) {
				tail = tail.next;
			}
			tail.next = newNode;
			size++;
		}
		
		// Insert Mid
		Node prev = head;
		for(int i=0;i<index-1;i++) {
			prev = prev.next;
		}
 		newNode.next = prev.next;
		prev.next = newNode;
		size++;
	}
	
	public void display() {
		Node print = head;
		while(print!= null) {
			System.out.print(print.data + " ");
			print = print.next;
		}
	}
	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.insertFirst(2);
		 obj.insertFirst(1);
		 obj.insertLast(4);
		 obj.insertLast(5);
		 obj.Insert(10, 2);
		 obj.Insert(10, 2);
		obj.display();
	}
}
