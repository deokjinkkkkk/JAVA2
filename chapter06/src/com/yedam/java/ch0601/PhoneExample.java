package com.yedam.java.ch0601;

public class PhoneExample {
	public static void main(String[] args) {
		SamrtPhone iphone14Pro = new SamrtPhone("iphone14Pro");
		
		iphone14Pro.maker = "Apple";
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 1000000;
		
		System.out.println("나의 핸드폰은 " + iphone14Pro.maker + " 입니다.");
		System.out.println("나의 핸드폰 기종은 "  + iphone14Pro.name + "입니다.");
		System.out.println("핸드폰의 가격은 " + iphone14Pro.price + "원 입니다");
		
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		SamrtPhone zflip4 = new SamrtPhone("zflip4");
		
		System.out.println("객체 생성시 생성자에 초기값을 안 넣어준 경우");
		System.out.println(zflip4.name);
		
		zflip4.name = "zflip4";
		zflip4.maker = "samsung";
		zflip4.price = 900000;
		
		zflip4.call();
		zflip4.hangUp();
		
		System.out.println(iphone14Pro);
		System.out.println(zflip4);
	}
}
