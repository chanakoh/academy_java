package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoListTest {
	//private ArrayList<String> tasks;
	private Map<String,Integer> task2;
	
	public TodoListTest () {
		//tasks = new ArrayList<>();
		task2 = new HashMap<>();
	}
	
	public void addTask(String tasks, int taski) {
		task2.put(tasks,taski);
		
	}
	
	public void removetask(String id) {
		if(task2.containsKey(id)) {
			task2.remove(id);
		}else {
			System.out.println("�߸���!");
		}
	
	}
	
	public void displayTask() {
		System.out.println("my TodoList");
		for(Map.Entry<String, Integer> a : task2.entrySet()) {
			String t1 = a.getKey();
			int t2 = a.getValue();
			System.out.println(t1+"��"+t2+"��°");
		}
	//public void 	
		
	}
	public static void main(String[] args) {
		TodoListTest todoList = new TodoListTest();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰�:add, ����:remove, ���Ϻ���:list, ����:exit �Է��ϼ���.");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.next();
				System.out.println("������ �Է��ϼ���");
				int task2 = sc.nextInt();
				todoList.addTask(task,task2);
			}else if(choice.equals("remove")||choice.equals("REMOVE")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					String id = sc.next();
					todoList.removetask(id);
				}catch(Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			}else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTask();
			}else if(choice.equalsIgnoreCase("exit")){
				break;
			}else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}
}
