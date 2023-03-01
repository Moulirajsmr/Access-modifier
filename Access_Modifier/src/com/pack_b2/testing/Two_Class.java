package com.pack_b2.testing;

import com.pack_b1.testing.One_Class;

public class Two_Class {
	
	public void car_one() {
		System.out.println("Car_One");
	}		
	private void car_two() {
		System.out.println("Car_Two");
	}
	void car_three() {
		System.out.println("Car_Three");
	}
	protected void car_four() {
		System.out.println("Car_Four");
	}
	
	public static void main(String[] args) {
		One_Class k = new One_Class();
		Two_Class h = new Two_Class();
		k.bike_one();
		h.car_one();
		h.car_two();
		h.car_three();
		h.car_four();		
	}
	

}
