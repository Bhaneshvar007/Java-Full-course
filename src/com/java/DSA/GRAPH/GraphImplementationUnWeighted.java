package com.java.DSA.GRAPH;

import java.util.ArrayList;
import java.util.*;
 
public class GraphImplementationUnWeighted {
	static class Edge {
		int src;
		int dest;

		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;
		}
	}
	
	// create a graph function;
	public static void create_Graph(ArrayList<Edge> graph[]) {
		
		// Graph me abhi null value use arraylist se replace karna padega jisse ki uski value change ho sake
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0 , 2));
		
		graph[1].add(new Edge(1 , 2));
		graph[1].add(new Edge(1 , 3));
		
		graph[2].add(new Edge(2 , 0));
		graph[2].add(new Edge(2 , 1));
		graph[2].add(new Edge(2 , 3));
		
		graph[3].add(new Edge(3 , 1));
		graph[3].add(new Edge(3 , 2));
	}
	
	 
	
	// Creating a graph we will use the adjancecy list because it's time complicity O(vertex) 
	public static void main(String[] args) {
		int V = 4;
		ArrayList<Edge> graph[] = new ArrayList[V];
		create_Graph(graph);
		
		// Find the neighbors of x
		int x = 2;
		for(int i=0;i<graph[x].size();i++) {
			Edge e = graph[x].get(i);
			System.out.print(e.dest +" ");
		}
	}
}
