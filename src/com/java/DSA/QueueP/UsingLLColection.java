package com.java.DSA.QueueP;
import java.util.*;
public class UsingLLColection {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>(); // Queue is a interface jise 2 classes acess karti ahai 1. linked list 2 ArrayDeque
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(50);
 	while(!q.isEmpty()) {
		System.out.print(q.remove() + " ");
	} 
}
}
