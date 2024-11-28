package com.java.DSA.QueueP;

public class UsingArrayImplemen {

	static public class QueueInner {
		int arr[];
		int rear;
		int size;

		QueueInner(int size) {  //Constructor
			this.size = size;
			rear = -1; // Now Queue is empty when insert any element in queue rear is update.
			arr = new int[size];
		}

		// check queue is empty or not.
		public boolean IsEmpty() {
			return (rear == -1);
		}

		// check queue is full or not.
		public boolean IsFull() {
			return (rear == size - 1);
		}

		// Insert the element in the queue;
		public void addEl(int data) {  // Enqueue.
			if (IsFull()) {
				return;
			}
//			rear++; // When element is come inside the queue rear is update by one;
			arr[++rear] = data;
		}

		// remove the element from the queue;
		public int remove() { // Dequeue
			                  // Int bhi ho sakta hai & void bhi ho sakta hai.
			                  //Int me data ka pata chal jayega ki kon sa element delete ho rha hai.
          if(IsEmpty()) {
        	  return -1;
          }
          int front = arr[0];
          for(int i=0;i <size-1;i++) {
        	  arr[i] = arr[i+1];
          }
          rear--;
          return front;
          
		}

		// Get the first element of the queue.
		public int peek() {
			if(IsEmpty()) {
				return -1;
			}
			return arr[0];
		}
	}

	public static void main(String[] args) {
		QueueInner ob = new QueueInner(10);
		ob.addEl(1);
		ob.addEl(2);
		ob.addEl(3);
		ob.addEl(4);
		System.out.println(ob.IsEmpty());		
		System.out.println(ob.IsFull());
		while(ob.IsEmpty()==false) {
			System.out.print(ob.peek() + " , ");
			ob.remove();
		}
	}

}
