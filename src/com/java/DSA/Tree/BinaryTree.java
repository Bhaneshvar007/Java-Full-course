package com.java.DSA.Tree;

public class BinaryTree {
	static class Node {
		 int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class bt {
		static int ind = -1; // Binary tree me koi bhi element nhi hai

		public static Node build(int[] arr) { // i will creating the new Node using the build method;
			ind++;
			if (arr[ind] == -1) // when no element in my tree
				return null;
			
			Node newNode = new Node(arr[ind]);
//			System.out.print(newNode.data + " "); // Print for pre-Order 
			newNode.left = build(arr);
			System.out.print(newNode.data + " ");  // print for In-Order
			newNode.right = build(arr);
//			System.out.print(newNode.data + " ");  // print for Post-Order
			return newNode;	
		}	
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,8,-1,-1,-1,5,-1,-1,3,6,-1,9,-1,-1,7,-1,-1};
		bt tree = new bt();
		Node root = tree.build(arr);
		 
//		System.out.println(root.data);
//		System.out.println(root.left.data);
//		System.out.println(root.right.data);
	}
}
