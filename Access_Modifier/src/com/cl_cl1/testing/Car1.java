package com.cl_cl1.testing;

public class Car1 {
	
	public void luxury() {
		System.out.println("1-Rolls Royce");
	}
	private void suv() {
		System.out.println("1-Toyata");
	}
	
	protected void jeep() {
		System.out.println("1-Mahendria");
		
	}
	void race() {
		System.out.println("1-Honda");
	}
	public static void main(String[] args) {
		Car1 m = new Car1();
		m.luxury();
		m.suv();
		m.jeep();
		m.race();
	}

}
