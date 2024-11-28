package com.java.DSA.GRAPH;

import java.util.*;
import java.io.*;

class ShortestPath {
	static final int V = 7;
	static int dist[] = new int[V];
	
	static void printSolution( int n)
	{
		System.out.println("Vertex Distance from Source");
		for (int i = 0; i < V; i++)
			System.out.println(i + " -> " + dist[i]);
	}
	
	int minDistance(boolean spt[])
	{
		 int min = Integer.MAX_VALUE , minInd = -1;
		 for(int v=0;v<V;v++) {
			 if(dist[v]<=min && spt[v] == false) {
				 min = dist[v];
				 minInd = v;
			 }
		 }
		 return minInd;
	}
	
	void dijkstra(int graph[][], int src)
	{
         boolean[] spt = new boolean[V];
         for(int i=0;i<V;i++) {
        	 dist[i] = Integer.MAX_VALUE; // fill every index by infinity
         }
         dist[src] = 0; // starting point
         for(int i=0;i<V-1;i++) {  // v-1 esily kyuki ham 0 ko pahle cover kar chuke hai line no-29 }
        	 int u = minDistance(spt); // check minimum edges s to d;
        	 spt[u] = true; // jis edges ko cover kar liya hai use true karna hai
        	 for(int v = 0; v < V; v++) {
        		 // if(Edge hona chahiye &&
        		 // spt me pahle se path hona chahiye &&
        		 // curr vertex ke liye edge pahle bar aani chaiye && 
        		 // dist me jo element hai wo agr bada huaa to minimum find out karna hai)
        		 
        		 if(graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && spt[v] == false && dist[u]+graph[u][v] < dist[v]) {
        			 dist[v] = dist[u] + graph[u][v];
        		 }
        	 }
         }
	}

	
	public static void main(String[] args)
	{
		
		int graph[][] = new int[][] { { 0,2,3,0,2,0,0},
									{ 2,0,0,0,0,0,3},
									{ 3,0,0,1,0,8,0},
									{ 0,0,1,0,1,0,0 },
									{ 2,0,0,1,0,1,0 },
									{ 0,0,8,0,1,0,7 },
									{ 0,3,0,0,0,7,0} };
		ShortestPath t = new ShortestPath();
		t.dijkstra(graph, 0);
		printSolution(V);
	}
}