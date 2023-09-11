package com.kh.todoList;

public class TodoListMain {
	
	public static void main(String[] args) { 
	TodoListModel tdmodel = new TodoListModel("¾ÆÄ§¸Ô±â");
	TodoListView tdview = new TodoListView();
	
	String model = tdmodel.getItem();
	System.out.println(model);
    tdmodel.view(); 
	tdview.displayTodoList();

	}
}
