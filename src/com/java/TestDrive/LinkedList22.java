package com.java.TestDrive;

public class LinkedList22 {
    Node head;
    private int size;
	LinkedList22(){
		this.size = -1;
	}
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
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
		
		if(head == null) head = newNode;
		
		Node tail = head;
		while(tail.next!=null) {
			tail = tail.next;
		}
		tail.next = newNode;
		size++;
	}
	
	public void insertMid(int data, int ind) {
		if(ind < 0 || ind>size) {
			return;
		}
		Node newNode = new Node(data);

		if(ind == 0) {
			newNode.next= head;
			head = newNode;
			size++;
		}
		
		if(ind == size) {
			if(head == null) head = newNode;
			Node tail = head;
			while(tail.next!=null) {
				tail = tail.next;
			}
			tail.next = newNode;
			size++;
		}
		
		Node prev = head;
		for(int i=0;i<ind-1;i++) {
			prev = prev.next;
		}
		
		Node temp = prev.next;
		prev.next = newNode;
		newNode.next = temp;
		size++;
	}
	
	
    public void deleteFirst() {
    	if(head == null) {
    		System.out.println("No more element");
    		return;
    	}
    	
    	head = head.next;
    	size--;
    }
    
    public void deleteLast() {
    	if(head == null) {
    		System.out.println("No more element");
    		return;
    	}
    	
    	Node prev = head;
    	Node curr = head.next;
    	while(curr.next!=null) {
    		curr = curr.next;
    		prev = prev.next;
    	}
    	
    	prev.next = prev.next.next;
    	size--;
    }
    
    public void deleteMid(int ind) {
    	if(ind<0 || ind>size) {
    		System.out.println("\"List index out of bound\" ");
    	}
    	
    	if(ind == 0) {
    		head = head.next;
    	}
    	size--;
    	
    	
    	if(ind == size) {
    		if(head == null) {
        		System.out.println("No more element");
    			return;
    		}
    		
    		Node prev = head;
        	Node curr = head.next;
        	while(curr.next!=null) {
        		curr = curr.next;
        		prev = prev.next;
        	}
        	
        	prev.next = prev.next.next;
    	}
    	
    	Node prev = head;
        for(int i=0;i<ind-1;i++) {
        	prev=prev.next;
        }
        
//        prev.next = prev.next.next;
//        Node del = prev.next;
//        prev.next = del.next;
    }
    
	public void print() {
		Node print = head;
		while(print !=null) {
			System.out.print(print.data + " ");
			print = print.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		LinkedList22 list = new LinkedList22();
		list.insertFirst(10);
		list.insertFirst(10);
		list.insertFirst(10);
		list.insertMid(100, 1);
		list.insertLast(200);
		list.deleteMid(4);
		list.print();
	}
}
