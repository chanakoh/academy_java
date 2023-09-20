package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 10;
		Graph graph = new Graph(ver);
		
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		graph.addEdge(2, 7);
		graph.addEdge(1, 2);
		graph.addEdge(3, 7);
		System.out.println("DFSÅ½»ö °á°ú : ");
		graph.DFS(1);
	
		
	}

}
