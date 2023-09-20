package com.kh.Practice;

public class BFSGraphMain {

	public static void main(String[] args) {
		BFSGraph b = new BFSGraph(8);
		b.addEdge(0,1);
		b.addEdge(0,2);
		b.addEdge(0,3);
		b.addEdge(1,2);
		b.addEdge(1,4);
		b.addEdge(2,5);
		b.addEdge(2,6);
		b.addEdge(2,7);
		b.addEdge(3,7);
		System.out.println("BFS Å½»ö °á°ú:");
		b.BFS(1);
		
	}

}
