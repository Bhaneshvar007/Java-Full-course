package com.java.TestDrive;

public class QueueUsingArray {
	int size;
	int rear;
	int arr[];
	QueueUsingArray(int s){
		this.size = s;
		this.rear =-1;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return rear == -1;
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	public void addElement(int data) {
		if(isFull()) {
			return;
		}
		rear++;
		arr[rear] = data;
	}
	
	public void remove() {
		if(isEmpty()) return ;
		
 		for(int i=0;i<size-1;i++) {
			arr[i] = arr[i+1];
		}
		rear--;
 	}
	
	public int peek() {
		if(isEmpty()) return -1;
        return arr[0];
	}
public static void main(String[] args) {
	QueueUsingArray Q = new QueueUsingArray(4);
	Q.addElement(10);
	Q.addElement(20);
	Q.addElement(30);
	Q.addElement(40);
	System.out.println("Queue Implementation using array :");
	while(Q.isEmpty() == false) {
		System.out.print(Q.peek() +" ");
		Q.remove();
	}
	
}
}
