package com.kh.AbstractSampel.animal;

public class Cat extends Animal {
private String howling;
	
	public Cat(String name, String howling) {
		super(name);
		this.howling = howling;
	}
	@Override
	public String makeSound() {
		System.out.println("동물의 울음소리는 : "+howling);
		return howling;
		
	}


}
