package com.cl_cl.testing;

public class Wild_Birds extends Wild_Animals {

	public void Birds_1() {
		System.out.println("2-eagle");
	}

	private void Birds_2() {
		System.out.println("2-dove");
	}

	protected void Birds_3() {
		System.out.println("2-peacock");
	}

	void Birds_4() {
		System.out.println("2-pigeon");
	}

	public static void main(String[] args) {
		Wild_Birds s = new Wild_Birds();
		s.Birds_1();
		s.Birds_2();
		s.Birds_3();
		s.Birds_4();
		s.animals_1();
		s.animals_3();
		s.animals_4();
	}
}
