package com.kh.AbstractSampel.animal;

public class Cat extends Animal {
private String howling;
	
	public Cat(String name, String howling) {
		super(name);
		this.howling = howling;
	}
	@Override
	public String makeSound() {
		System.out.println("������ �����Ҹ��� : "+howling);
		return howling;
		
	}


}
