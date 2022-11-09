package com.yedam.java.ch0601;

public class Car { //실행클래스 는 라이브러리 클래스와 다르게 main이 없다.
	//필드 : 속성
	int maxSpeed = 100;
	String color = "red";
	
	//생성자, 생략해도 상관이 없다
	public Car() { //class와 이름이 같아야 한다, 생성자는 리턴값이 없다.
		System.out.println("자동차가 출하되었습니다.");
	}

	//메소드 : 동작
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}
}
