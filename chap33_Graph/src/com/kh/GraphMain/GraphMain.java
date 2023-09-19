package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 10;//그래프 노드의 수를 5로 정의
		Graph graph = new Graph(ver);
		
		// 0 1 2 3 4 5 6 7 8 
		
		//addEdge 간선 추가하겠다.
		graph.addEdge(0, 1);//노드 0에서 노드 1로 있는 엣지를 추가
		graph.addEdge(2, 3);//노드 0에서 노드 2로 있는 엣지를 추가
		graph.addEdge(4, 5);
		graph.addEdge(5, 9);
		graph.addEdge(1, 7);
		graph.addEdge(7, 2);
		graph.addEdge(3, 5);
		graph.addEdge(9, 8);
		System.out.println("DFS탐색 결과 : ");
		//DFS탐색을 시작할 노드의 번호를 전달
		//0으로 시작
		graph.DFS(0);
		System.out.println();
		System.out.println("DFS탐색 결과 : ");
		graph.DFS(4);
		
	}

}
/*DFS탐색을 시작하여 그 결과를 출력
탐색 결과는 시작 노드에서 출발하여 깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력 
 
 */