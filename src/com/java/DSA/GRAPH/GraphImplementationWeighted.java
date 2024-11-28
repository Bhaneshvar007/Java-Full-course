package com.java.DSA.GRAPH;

import java.util.*;

import com.java.DSA.GRAPH.GraphImplementationUnWeighted.Edge;

public class GraphImplementationWeighted {
	static class Edge {
		int src;
		int dest;
		int wgt;

		Edge(int s, int d, int w) {
			this.src = s;
			this.dest = d;
			this.wgt = w;
		}

		private static void CreateGraph(ArrayList<Edge>[] graph) {
			for (int i = 0; i < graph.length; i++) {
				graph[i] = new ArrayList<>();
			}

			graph[0].add(new Edge(0, 1, 1));
	        graph[0].add(new Edge(0, 2, 1));
	        
	        graph[1].add(new Edge(1, 0, 1));
	        graph[1].add(new Edge(1, 3, 1));

	        graph[2].add(new Edge(2, 0, 1));
	        graph[2].add(new Edge(2, 4, 1));
	        
	        graph[3].add(new Edge(3, 1, 1));
	        graph[3].add(new Edge(3, 4, 1));
	        graph[3].add(new Edge(3, 5, 1));
	        
	        graph[4].add(new Edge(4, 2, 1));
	        graph[4].add(new Edge(4, 3, 1));
	        graph[4].add(new Edge(4, 5, 1));
	        
	        graph[5].add(new Edge(5, 3, 1));
	        graph[5].add(new Edge(5, 4, 1));
	        graph[5].add(new Edge(5, 6, 1));
	        
	        graph[5].add(new Edge(6, 5, 1));

		}
		
		// Perform the BFS Operation ( BFS-> Level Order Traversal )
		public static void bfs (ArrayList<Edge> graph[] , int V) {
			Queue<Integer> q = new LinkedList<>();
			boolean visit[] = new boolean[V];
			
			q.add(0);
			while(!q.isEmpty()) {
				int curr = q.remove();
				if(visit[curr] == false) { // Now we can not be visited the graph
					System.out.print(curr + " ");
					visit[curr] = true; // When we will visit the path we can be update the 
				}
				for(int i=0;i<graph[curr].size();i++) { 
					Edge e = graph[curr].get(i); // find the neighbors of the graph
					q.add(e.dest);
				}
			}
		}
		
		
		
		// DFS traversal of the graph; ( DFS -> first visit all the point of the edges then move next vertex;
		public static void dfs(ArrayList < Edge > graph[], int curr, boolean visited[]) {
	        if (visited[curr]) { // When all graph are visited
	            return;
	        }
	        System.out.print(curr + " ");
	        visited[curr] = true; // this position is visited
	        for (int i = 0; i < graph[curr].size(); i++) {
	            Edge e = graph[curr].get(i);
	            dfs(graph, e.dest, visited);
	        }
	    }
		
		

		public static void main(String[] args) {
			int V = 7;
			ArrayList<Edge> graph[] = new ArrayList[V];
			CreateGraph(graph);
			
//			bfs(graph , V);
			dfs(graph, 0, new boolean[V]);
//			int x = 2;
//			for (int i = 0; i < graph[x].size(); i++) {
//				Edge e = graph[x].get(i);
//				System.out.println(e.dest + " , " + e.wgt);
//			}
		}

	}
}
