package com.yedam.chapter0801;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		System.out.println("================");
		myCar.frontLeftTire = new MichelinTire();
		myCar.frontRightTire = new MichelinTire();
		
		myCar.run();
		
	}
	
}
