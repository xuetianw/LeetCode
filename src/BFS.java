// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.

import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class BFS {
    private int V; // No. of vertices
    private List<Integer> adj[]; //Adjacency Lists

    Queue<Integer> q = new LinkedList<>();

    // Constructor
    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        Boolean[] visited = new Boolean[V];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        List<Integer> frontier = new ArrayList<>();
        visited[s] = true;
        frontier.add(s);

        while (frontier.size() != 0) {
            int vertex =  frontier.get(0);
            frontier.remove(0);
            System.out.printf("visiting %d \n", vertex);

            for (int adj_vertex : adj[vertex]) {
                if (!visited[adj_vertex]) {
                    visited[adj_vertex] = true;
                    frontier.add(adj_vertex);
                }
            }
        }
    }

    // Driver method to
    public static void main(String args[]) {

        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        /*
            output :
            Following is Breadth First Traversal (starting from vertex 2)
            2 0 3 1
         */
        g.BFS(2);

    }
}
// This code is contributed by Aakash Hasija


