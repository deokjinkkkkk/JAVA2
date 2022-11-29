package com.yedam.java.lamda;

import com.yedam.java.common.MyfunctionalClass;

public class MainExample {
	
	public static void main(String[] args) {
		MyFuncInterface fi1 = () -> {System.out.println("람다식 메소드 구현");};
		fi1.method();
		//람다식 : 함수를 정의
		//인터페이스 하나의 추상메소드
		MyFuncInterface fi2 = new MyFuncInterface() {
			
			@Override
			public void method() {
				System.out.println("익명 구현 객체 메소드 구현");
			}
		};
		fi2.method();
		
		fi1 = () -> System.out.println("람다식 메소드 구현 시 실행구분 생략");
		fi1.method();
	}
}
