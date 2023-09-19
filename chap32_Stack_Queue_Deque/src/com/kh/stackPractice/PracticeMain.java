package com.kh.stackPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	public static void main(String[] args) {
	//stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
	PracticeMain pm = new PracticeMain();
	pm.PracticeQueue();
	
	}
	public void PracticeStack() {
	Stack<String> stack = new Stack<>();
	stack.push("1");
	stack.push("2");
	stack.push("3");
	stack.push("4");
	stack.push("5");
	stack.push("6");
	stack.pop();
	System.out.println(stack.pop());
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.size());
	System.out.println(stack.contains("1"));
	}
	public void PracticeQueue() {
	Queue<String> queue = new LinkedList<>();
	queue.offer("a");
	queue.offer("b");
	queue.offer("c");
	System.out.println(queue);
	System.out.println(queue.poll());
	
	while(!queue.isEmpty()) {
		String element = queue.poll();
		System.out.println(element);
	}
	
	}	
}	
