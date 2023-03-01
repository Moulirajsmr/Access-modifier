package com.pack_a1.testing;

public class Class_A {
	
	//package to package with extends
	
	public void one() {
		System.out.println("The One");
	}
	
	private void two() {
		System.out.println("The Two");
	}
	
	void three() {
		System.out.println("The Three");
	}
	
	protected void four() {
		System.out.println("The Four");
	}
	
	public static void main(String[] args) {
		Class_A a = new Class_A();
		a.one();
		a.two();
		a.three();
		a.four();
	}

}
