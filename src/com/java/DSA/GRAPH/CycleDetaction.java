package com.java.DSA.GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//Dijkstra algorithm
class CycleDetaction {

    private final int V;
    private final List<List<Integer> > adj;

    public CycleDetaction(int V)
    {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }

    public void addEdge(int source, int dest)
    {
        adj.get(source).add(dest);
    }
    
    // Step 1
    public boolean isCyclic(){
      boolean vis[] = new boolean[V];
      boolean recStack[] = new boolean[V];
      
      for(int i=0;i<V;i++){
          if(dfs(i,vis,recStack)) return true;
      }
      return false;
          
      }
      
      
      public boolean dfs(int i , boolean[] vis , boolean[] recStack){
          if(recStack[i]) return true;
          if(vis[i]) return false;
          
          vis[i] = true;
          recStack[i] = true;
          
          List<Integer> li = adj.get(i);
          for(Integer x : li){
              if(dfs(x,vis,recStack)) return true;
          }
          recStack[i] = false; // BackTracking
          return false;
      }
    
   

    // Driver code
    public static void main(String[] args)
    {
        int V=6;
        CycleDetaction graph = new CycleDetaction(V);
         
        graph.addEdge(0,1);
        graph.addEdge(0,5);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,2);
        
    
        if (graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
            
    }
}