package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
		private int P;
		private LinkedList<Integer>[] adj;
		
		public BFSGraph(int p) {
			P=p;
			adj= new LinkedList[p];
			for ( int i = 0; i < p; ++i) {
				adj[i] = new LinkedList();
			}
		}
		public void addEdge(int p, int w) {
			adj[p].add(w);
		}

public void BFS(int start) {
	boolean[] vistied = new boolean[P];
	Queue<Integer> queue = new LinkedList<>();
	vistied[start] = true;
	queue.add(start);
	while(!queue.isEmpty()) {
		start = queue.poll();
		System.out.print(start + " ");
		for(Integer neighbor : adj[start]) {
			if(!vistied[neighbor]) {
				vistied[neighbor] = true;
				queue.add(neighbor);
			}
		}
	}
}

}
