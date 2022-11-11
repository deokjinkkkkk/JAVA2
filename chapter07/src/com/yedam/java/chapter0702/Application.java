package com.yedam.java.chapter0702;

public class Application {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemTire = car.run();
			
			switch (problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				//frontLeftTire -> Tire
				//펑크
				//자식 클래스인 hankooktire로 교체
				//부모 클래스에서 오버라이딩 한 내용을 바꿔 끼우게 되는 것
				//자동 타입 변환으로 인해서 가능한 일.
				//HankookTire tire =  new HankookTire("앞왼쪽:,15);
				//car.frontLeftTire = tire
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); //Tire -> HankookTire 타입 변환
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
				
			}
		}
	}
}
