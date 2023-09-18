package com.kh.genericsPrcatice;

public class Box<Y> {
	Y content;
	
	public void put(Y item) {
		this.content = item;
	}
	public Y get() {
		return content;
	}
	}

