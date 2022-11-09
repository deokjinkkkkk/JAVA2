package com.yedam.java.ch0601;

public class CarExample {
	
	public static void main(String[] args) {
		Car car1 = new Car(); // 외부에서 값을 주지 못한다,,생성자를 불러온것
		System.out.println("최대 스피드 : " + car1.maxSpeed);
		System.out.println("색깔 : " + car1.color);
		car1.run();
		
		System.out.println();
		
		Car car2 = new Car();
		
		System.out.println("최대 스피드 : " + car2.maxSpeed);
		System.out.println("색깔 : " + car2.color);
		car2.run();
		
		System.out.println();
		
		if(car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
		}else {
			System.out.println("car1과 car2는 서로 다른 객체를 참조합니다.");
		} //new 연산자로 새로운 객체를 만들기 때문에 car1 과 car2는 서로 다른 객체를 참조한다.
	}
}
