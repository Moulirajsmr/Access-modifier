package com.pack_b1.testing;

public class One_Class {
	
	//package to package without extend
	
	public void bike_one() {
		System.out.println("Bike One");
	}
	
	private void bike_two() {
		System.out.println("Bike Two");
	}
	
	void bike_three() {
		System.out.println("Bike Three");
	}
	
	protected void bike_four() {
		System.out.println("Bike Four");
	}
	
	public static void main(String[] args) {
		One_Class k = new One_Class();
		k.bike_one();
		k.bike_two();
		k.bike_three();
		k.bike_four();
	}

}
