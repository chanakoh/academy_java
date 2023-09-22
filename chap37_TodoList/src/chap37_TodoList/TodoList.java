package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList {
	private ArrayList<String> tasks;
	
	public TodoList() {
		tasks = new ArrayList<>();
		Map<String,Integer> task2 = new HashMap<>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removetask(int index) {
		if(index >=0 && index < tasks.size()){
			tasks.remove(index);
		}else {
			System.out.println("�߸��� �ε����Դϴ�.");
	}
	}
	
	public void dosplauTask() {
		System.out.println("my TodoList");
		for(int i =0; i<tasks.size(); i++) {
			System.out.println((i+1)+"."+tasks.get(i));
		}
	}
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰�:add, ����:remove, ���Ϻ���:list, ����:exit �Է��ϼ���.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(task);
			}else if(choice.equals("remove")||choice.equals("REMOVE")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine())-1;
					todoList.removetask(index);
				}catch(Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			}else if (choice.equalsIgnoreCase("list")) {
				todoList.dosplauTask();
			}else if(choice.equalsIgnoreCase("exit")){
				break;
			}else {
				System.out.println("�߸��� �����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}
}