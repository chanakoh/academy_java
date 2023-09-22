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
			System.out.println("잘못됨!");
		}
	
	}
	
	public void displayTask() {
		System.out.println("my TodoList");
		for(Map.Entry<String, Integer> a : task2.entrySet()) {
			String t1 = a.getKey();
			int t2 = a.getValue();
			System.out.println(t1+"는"+t2+"번째");
		}
	//public void 	
		
	}
	public static void main(String[] args) {
		TodoListTest todoList = new TodoListTest();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가:add, 삭제:remove, 할일보기:list, 종료:exit 입력하세요.");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요.");
				String task = sc.next();
				System.out.println("순서를 입력하세요");
				int task2 = sc.nextInt();
				todoList.addTask(task,task2);
			}else if(choice.equals("remove")||choice.equals("REMOVE")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					String id = sc.next();
					todoList.removetask(id);
				}catch(Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			}else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTask();
			}else if(choice.equalsIgnoreCase("exit")){
				break;
			}else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		sc.close();
	}
}
