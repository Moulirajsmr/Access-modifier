package com.cl_cl2.testing;

public class Transport1 {
	
	public void car() {
		System.out.println("the car");
	}
	void bus() {
		System.out.println("the bus");
	}
	private void train() {
		System.out.println("the train");
	}
	protected void plane() {
		System.out.println("the plane");

	}
	public static void main(String[] args) {
		Transport1 m = new Transport1();
		m.car();
		m.bus();
		m.plane();
		m.train();
	}

}
