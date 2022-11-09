package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자
	public Car() {
		
	}
	
	public Car(String model) {
//		this.model = model;
		this(model,"은색", 250);
	}
	
	public Car(String model, String color) {
		//this.model = model;	//this 는 인스턴스를 호출하는 종류는 생성자와 메소드 이다.
		//this.color = color;	//생성자가 있으면 자바가 임의로 생성자를 생성하지 않는다.
								//생성자가 없을때만 임의로 생성자를 생성한다.
		this.company = "웨스턴";
		this(model,color,250);
		
	}					
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
