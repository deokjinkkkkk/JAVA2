package com.yedam.java.generic;

public class Box<T> {  
	//타입을 담을수 있는 변수를 선언
	//generic은 대부분 의미가 부여되지않는 대문자 하나로 한다.
	
	private T field;

	
	public void set(T value) {
		this.field = value;
	}
	
	public T get() {
		return this.field;
	}
	 
}
