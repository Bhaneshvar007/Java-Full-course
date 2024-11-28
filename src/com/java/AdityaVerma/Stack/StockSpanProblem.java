package com.java.AdityaVerma.Stack;

import java.util.Stack;

public class StockSpanProblem {

//	brout fourcse approach

//	public static int[] stock_span(int arr[], int n) {
//		int ans[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			int count = 0;
//			for (int j = i; j >= 0; j--) {
//				if (arr[i] >= arr[j]) {
//					count++;
//				}
//				if (arr[i] < arr[j]) {
//					break;
//				}
//			}
//			ans[i] = count;
//		}
//		return ans;
//
//	}

	public static int[] stockSpan(int arr[], int n) {
		Stack<Integer> st = new Stack<>();
		int a[] = new int[n];
		int b[] = new int[n];
		a[0] = -1;
		st.push(0);
		for (int i = 1; i < n; i++) {
			while (!st.isEmpty() && arr[st.peek()] <= arr[i]) { // stack element is smaller to the array element pop
																// until condition false;
				st.pop();
			}
			if (st.isEmpty()) {
				a[i] = -1;
			} else {
				a[i] = st.peek();
			}
			st.push(i);
		}
		// that's a way of find the stock span array
		for (int i = 0; i < n; i++) {
			b[i] = i - a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
		System.out.println("Stock span problem : ");
		int n = arr.length;
		int temparr[] = stockSpan(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(temparr[i] + " ");
		}
	}
}
