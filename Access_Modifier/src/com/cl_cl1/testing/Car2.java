package com.cl_cl1.testing;

public class Car2 extends Car1 {

	private void bus() {
		System.out.println("2-TATA");
	}

	public static void main(String[] args) {

		Car2 n = new Car2();
		n.bus();
		n.luxury();
		n.jeep();
		n.race();
	}
}
