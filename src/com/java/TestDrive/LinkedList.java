package com.java.TestDrive;

import java.util.*;

//import com.java.DSA.LinkedList.PrintLL.Node;

public class LinkedList {
	Node head;
	private int size;
	LinkedList(){
		this.size=0;
	}
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	public void InsertFirst(int data) {
		Node nNode = new Node(data);
		nNode.next = head;
		head = nNode;
		size++;
	}
	
	public void InsertLast(int data) {
		Node nNode = new Node(data);
		if(head == null) {
			head = nNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = nNode;
		size++;
	}
	
	public void Insert(int ind , int data) {
		Node nNode = new Node(data);
		if(ind < 0 || ind > size) {
			return;
		}
		
		if(ind ==0) {
			nNode.next = head;
			head = nNode;
			size++;
		}
		
		if(ind ==size) {
			if(head == null) {
				head = nNode;
				return;
			}
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = nNode;
			size++;
		}
		
		Node prev = head;
		for(int i=0;i<ind-1;i++) {
			prev = prev.next;
		}
		nNode.next = prev.next;
		prev.next  =nNode;
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
		LinkedList ll = new LinkedList();
		ll.InsertFirst(10);
		ll.InsertFirst(5);
		ll.InsertLast(20);
		ll.Insert(1, 100);
		ll.display();
	}
	
	

}
