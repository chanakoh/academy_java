package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 10;//�׷��� ����� ���� 5�� ����
		Graph graph = new Graph(ver);
		
		// 0 1 2 3 4 5 6 7 8 
		
		//addEdge ���� �߰��ϰڴ�.
		graph.addEdge(0, 1);//��� 0���� ��� 1�� �ִ� ������ �߰�
		graph.addEdge(2, 3);//��� 0���� ��� 2�� �ִ� ������ �߰�
		graph.addEdge(4, 5);
		graph.addEdge(5, 9);
		graph.addEdge(1, 7);
		graph.addEdge(7, 2);
		graph.addEdge(3, 5);
		graph.addEdge(9, 8);
		System.out.println("DFSŽ�� ��� : ");
		//DFSŽ���� ������ ����� ��ȣ�� ����
		//0���� ����
		graph.DFS(0);
		System.out.println();
		System.out.println("DFSŽ�� ��� : ");
		graph.DFS(4);
		
	}

}
/*DFSŽ���� �����Ͽ� �� ����� ���
Ž�� ����� ���� ��忡�� ����Ͽ� ���� �켱���� Ž�� �� ��带 �湮�� ������� ��� 
 
 */