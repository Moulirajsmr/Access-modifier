package com.pack_a2.testing;

import com.pack_a1.testing.Class_A;

public class Class_B extends Class_A {
	
	public void apple() {
		System.out.println("The Apple");
	}	
	private void bat() {
		System.out.println("The Bat");
	}
	void cat() {
		System.out.println("The Cat");
	}
	protected void doll() {
		System.out.println("The Doll");
	}
	
	public static void main(String[] args) {
		Class_B b = new Class_B();
		b.apple();
		b.bat();
		b.cat();
		b.doll();
		b.one();		
		b.four();
	}
	

}
