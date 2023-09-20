package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph Ŭ����
 	�ڷ� ������ ��Ÿ��
 * */
public class Graph {
	private int V; //�׷����� ���� ��
	private LinkedList<Integer>[] adj; //���� ����Ʈ
	
	//�׷��� �ʱ�ȭ
	public Graph(int v) {
		//Graph Ŭ������ �����ڿ��� �׷����� ���� �� (V)�� �޾Ƽ� �ʱ�ȭ
		V = v;
		adj = new LinkedList[v];
		//adj ���� ����Ʈ�� ��Ÿ����, �� �������� ������ �������� ����� ����
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	//�׷��� ���� �߰�
	//addEdge �׷����� ������ �߰�
	//v�� w�� ������ �� �� ������ ��Ÿ��
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	//BFS Ž���� ����
	public void BFS(int start) {
		//vistied �迭�� �� ������ �湮 ���θ� ����
		boolean[] vistied = new boolean[V]; //�湮 ���θ� ǥ���ϱ� ���� �迭
		//BFS�� ���� ������ ������ ���
		Queue<Integer> queue = new LinkedList<>();
		//Ž���� ���� ���(start)���� �����ϰ�
		//���� ��带 �湮�ϰ� ť�� �߰�
		vistied[start] = true;
		queue.add(start);
		//ť�� ����� ������ �ݺ������� ���� �ܰ迡 ������ ��带 �湮
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
