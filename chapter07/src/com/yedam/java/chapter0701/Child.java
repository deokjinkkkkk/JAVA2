package com.yedam.java.chapter0701;

public class Child extends Parent{
	//Child는 parent 의 클래스를 받아올수 있다.
	//필드
	public String lastName;
	public int age;
	
	@Override
	public void method1() {
		System.out.println("Child 클래스 재정의 된 method1 호출");
	}
	
	public void method3() {
		System.out.println("Child 클래스 method3 호출");
	}
}
