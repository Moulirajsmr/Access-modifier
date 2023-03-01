package com.cl_cl.testing;

public class Wild_Animals {

	public void animals_1() {
		System.out.println("1-Lion");
	}

	private void animals_2() {
		System.out.println("1-Tiger");
	}

	protected void animals_3() {
		System.out.println("1-Deer");
	}

	void animals_4() {
		System.out.println("1-Cheetah");
	}

	public static void main(String[] args) {
		Wild_Animals m = new Wild_Animals();
		m.animals_1();
		m.animals_2();
		m.animals_3();
		m.animals_4();
	}
}
