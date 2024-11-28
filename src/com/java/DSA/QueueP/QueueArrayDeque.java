package com.java.DSA.QueueP;
import java.util.*;
public class QueueArrayDeque{
public static void main(String[] args) {
	Queue<Integer> Q = new ArrayDeque<>();
	Q.add(1);
	Q.add(2);
	Q.offer(3);
	Q.element();
	 while(!Q.isEmpty()) {
		 System.out.print(Q.peek() + " ");
		 Q.remove();
	 }
}
}
