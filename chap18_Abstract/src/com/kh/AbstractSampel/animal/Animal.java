package com.kh.AbstractSampel.animal;

abstract class Animal {

	private String name;
	
	abstract String makeSound();
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		System.out.println("동물의 이름은 :"+name);
		return name;
		
	}
	

}
