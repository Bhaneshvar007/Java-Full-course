package com.java.DSA.QueueP;

import java.util.*;

public class UsingLL {
   static public class Queue_In{
	   LinkedList<Integer> list = new LinkedList<>();
	   int size;
       int rear;
       
       Queue_In(int size){
    	   this.size = size;
    	   rear=-1;
       }
       
       public boolean IsEmpty() {
    	   return rear==-1;
       }
       
       public boolean IsFull() {
    	   return rear == size-1;
       }
       
       public void AddFirst(int data) {
    	   if(IsFull()) return;
    	   rear++;
    	   list.addFirst(data);
       }
       
       public void AddLast(int data) {
    	   if(IsFull()) return;
    	   rear++;
    	   list.addLast(data);
       }
       
       public int peek() {
    	   return list.getFirst();  
//    	   return list.getLast();
       }
       
       public int removeFirst() {
    	   rear--;
    	   return list.removeFirst();
       }
       
       public int removeLast() {
    	   rear--;
    	   return list.removeLast();
       }
	   
   }
   public static void main(String[] args) {
	Queue_In Q = new Queue_In(5);
    Q.AddLast(10);
    Q.AddLast(20);
    Q.AddFirst(30);
    Q.AddFirst(40);
    while(Q.IsEmpty() == false) {
    	System.out.print(Q.peek() + " , ");
    	Q.removeFirst();
    }
}
}
