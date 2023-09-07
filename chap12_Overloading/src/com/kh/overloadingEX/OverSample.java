package com.kh.overloadingEX;

public class OverSample {
	public double suma(double a, double b) {
		return a+b;
	}
	public double sumb(double d, double e) {
		return d+e;
	}
	public int sums(int a, int b , int c) {
		return a+b+c;
	}
	public double sumd(double a, double b , double c) {
		return a+b+c;
	}
	public int sumd(int a, int b , int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		OverSample obj = new OverSample();
		System.out.println("a:" + obj.suma(10.5,20.5));
		System.out.println("b:"+obj.suma(10.5,20.5));
		System.out.println("c:"+obj.sums(10,20,30));
		System.out.println("d:"+obj.sumd(10.5,20.5,30.5));
		System.out.println("e:"+obj.sumd(10,20,30));
	}
}

