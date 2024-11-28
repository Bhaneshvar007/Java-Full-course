package com.java.DSA.QueueP;

public class circularQueueUsingArray {
	static public class Cur_Queue {
		static int size;
		static int rear;
		static int front;
		static int arr[];

		Cur_Queue(int size) {
			arr = new int[size];
			front = -1;
			rear = -1;
			this.size = size;
		}

		public boolean isEmpty() {
			return rear == -1 && front == -1;
		}

		public boolean isFull() {
			return (rear + 1) % size == front;
		}

		public void add(int data) {
			if (isFull())
				return;

			// When 1 element insert first element in the queue;
			if (front == -1) {
				front = 0;
			}

			rear = (rear + 1) % size;
			arr[rear] = data;
		}
		
		public int remove() {
			if(isEmpty()) return -1;
			int result = arr[front];
			
			// Single eleemt ki condition.
			if(rear==front) {
				rear =front =-1;
			}
			else {
				front = (front+1) %size;
			}
			
			return result;
		}
		
		public int peek() {
			if(isEmpty()) return -1;
			
			return arr[front];
		}

	}
	
	public static void main(String[] args) {
		Cur_Queue cq = new Cur_Queue(5);
		cq.add(1);
		cq.add(2);
		cq.add(3);
		cq.add(4);
		cq.remove();
		cq.add(10);
		cq.remove();
		cq.add(20);
		while(!cq.isEmpty()) {
			System.out.print(cq.remove() + " "); // 3 4 10 20;
		}
	}
}
