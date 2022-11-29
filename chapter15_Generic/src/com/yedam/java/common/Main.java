package com.yedam.java.common;

public class Main {
	
	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.set("홍길동");
		box.set(1000);
		String name = (String)box.get();
		
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		
	}
}
