package com.kh.AbstractSampel.animal;

public class Dog extends Animal {

	private String howling;
	
	public Dog(String name, String howling) {
		super(name);
		this.howling = howling;
	}
	@Override
	public String makeSound() {
		System.out.println("������ �����Ҹ��� : "+howling);
		return howling;
		
	}


}

