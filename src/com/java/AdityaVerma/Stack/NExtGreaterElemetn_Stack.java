package com.java.AdityaVerma.Stack;

import java.util.Scanner;
import java.util.Stack;

public class NExtGreaterElemetn_Stack {
	public static void nge(int arr[] , int n) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (s.size() == 0) {   // when Stack is empty put -1;
                ans[i] = -1;
            } else if (s.size() > 0 && s.peek() > arr[i]) {  // when top element is greater arr[i].
                ans[i] = s.peek();
            } else if (s.size() > 0 && s.peek() <= arr[i]) {  // when top is equal or less arr[i]
                while (s.size() > 0 && s.peek() <= arr[i]) {  // jab tak koi greater element na mil jaye tak pop karna hai
                    s.pop();
                }
                if (s.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = s.peek();
                }
            }
            s.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the length of the array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) {
    	arr[i] = sc.nextInt();
    }
    nge(arr, n);
}
}
