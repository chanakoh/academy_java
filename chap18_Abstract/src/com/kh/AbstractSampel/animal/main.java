package com.kh.AbstractSampel.animal;

public class main {

	public static void main(String[] args) {
		Dog dog  = new Dog("��","�п�");
		dog.getname();
		dog.makeSound();
		
		Cat cat = new Cat("�����","�߿�");
		cat.getname();
		cat.makeSound();
		
		
		Animal[] animal = new Animal[2];
		animal[0] = new Dog("�۸���","�۸�");
		animal[1] = new Cat("�߿���","�߿�");

		
		//2. ��ä�迭�� Animal �����ؼ� ����ϱ� �������� Ȱ��
		//Animal[] animal = new Animal[2];
	}

}
