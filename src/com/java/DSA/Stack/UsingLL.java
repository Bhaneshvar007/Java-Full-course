package com.java.DSA.Stack;

import java.util.*;

public class UsingLL {

	LinkedList<Integer> list = new LinkedList<Integer>();

	public void pushTop(int data) {
		list.addFirst(data);
	}

	public void pushBot(int data) {
		list.addLast(data);
	}

	public int popTop() {
		int el = list.get(list.size() - 1);
		list.removeFirst();
		return el;
	}

	public int popBot() {
		int el = list.get(0);
		list.removeLast();
		return el;
	}
	
	public int size() {
		return list.size();
	}
	
	public int top() {
		return list.get(list.size()-1);
//		return list.getFirst();
	}
	
	public int bottom() {
		return list.getLast();
	}

	public static void main(String[] args) {
        UsingLL LL = new UsingLL();
        LL.pushBot(40);
        LL.pushTop(20);
        LL.pushTop(10);
        LL.pushBot(30);
//        System.out.println(LL.bottom());
        System.out.println(LL.popBot());
        System.out.println(LL.top());
        System.out.println(LL.size());
        System.out.println(LL.bottom());
        // Print the stack.
//        while(LL.size()>0) {
//        	System.out.println(LL.top());
//        	LL.popTop();
//        }
	}
}
