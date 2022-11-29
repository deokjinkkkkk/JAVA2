package com.yedam.java.generic;

public class Main {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		
		box1.set("홍길동");
//		box1.set(1000);
		String name = box1.get();
		
		Box<Integer> box2 = new Box<>();
		box2.set(1000);
		int value = box2.get();
		
		Box<Apple> appleBox = Utill.boxing(new Apple());
		Box<String> nameBox = Utill.boxing("홍길동");
		
		
	}

}
