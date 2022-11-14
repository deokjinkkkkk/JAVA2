package com.yedam.chapter0801;

public class MyClass {
	//필드
	//1)
	//public int a = 1;
	//필드에 참조 타입도 넣을수 있다.
	RemoteControl rc =new Television();
	//생성자
	//같은 변수여도 메개변수가 다르면 여러개 선언할수 있다. (오버로딩)
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
