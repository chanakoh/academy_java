package com.kh.api.exam1;

public class RepalceMain {

	public static void main(String[] args) {
		RepalceMain m = new RepalceMain();
		//m.replace1();
		m.replace3();
		m.replace4();
		m.replace5();
		m.replaceAll();
		
	}
	public void replace1() {
		String input = "Hello, world";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2: "+input2);
	}
	public void replace2( ) {
		String input = "Hello World";
		//World�� Java�� ��ü
		String reInput = input.replace("World","Java");
		System.out.println(reInput);
	}
	public void replace3() {
		String originName = "Hello world";
		String reInput = originName.replace("o", "x");
		System.out.println(reInput);
		//o�� �����ִ� ���ڿ��� x�� �����ϱ�
	}
	public void replace4() {
		String originString = "The quick brown fox jups overthe lazy dog";
		String reInput = originString.replace("for", "cat");
		System.out.println(reInput);
	}
	public void replace5( ) {
		String originString = "The quick brown fox jups overthe lazy dog";
		String reInput = originString.replace(" ", "");
		System.out.println(reInput);
		//��� ���� �����ϱ�
	}
	public void replaceAll() {
		String originString ="Hello World";
		//replcae��� replceAll�� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world","java");
		System.out.println(reAllstr);
	}

}
