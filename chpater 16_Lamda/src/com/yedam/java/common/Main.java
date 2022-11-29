package com.yedam.java.common;

public class Main {
	public static void main(String[] args) {
		MyFunctionalInterface mfi1 = new MyfunctionalClass();
		mfi1.method();
		
		MyfunctionalClass mic1 = new MyfunctionalClass();
		mic1.func();
		
		//익명 구현 객체 
		// 1) : 상속 혹은 구현의 관계에서 가능
		// 2) 재사용이 불가
		// 3) 고유의 메소드를 가질수는 없으나 외부에서 호출 불가
		MyFunctionalInterface mfi2 = new MyFunctionalInterface() {
			
			public void method() {
				System.out.println("익명 구현 객체를 통한 실행");
				func();
			}
			
			public void func() {
				System.out.println("익명 구현 객체 소유");
			}
		};	
		mfi2.method();
		
		MyfunctionalClass mfc2 = new MyfunctionalClass() {
			@Override
			public void method() {
				System.out.println("부모 클래스 상속 후 오버라이딩");
			}
			
			@Override
			public void func() {
				System.out.println("부모 클래스 상속 후 오버라이딩2");
			}
		};
		mfc2.method();
		mfc2.func();
	}
}
