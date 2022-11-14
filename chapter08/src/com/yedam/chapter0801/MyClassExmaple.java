package com.yedam.chapter0801;

public class MyClassExmaple {
	
	public static void main(String[] args) {
		System.out.println("1)--------");
		//RemoteControl rc = new Television();
		//mc안에 rc에있는 메소드를 호출하기 위해서 
		MyClass mc = new MyClass();
		mc.rc.turnOn();
		mc.rc.turnOff();
		
		System.out.println("2)------");
		//RemoteControl rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		//rc.turnOn();
		//rc.turnOff();
		
		System.out.println("3)-------");
		//RemoteControl rc = new  Audio();
		MyClass mc3 = new MyClass();
		mc3.methodA();
		//rc.turnOn();
		//rc.turnOff();
		
		System.out.println("4)------");
		//RemoteControl rc = new Television();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
		//rc.turnOn();
		//rc.turnOff();
	}
}
