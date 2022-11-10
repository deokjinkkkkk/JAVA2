package com.yedam.java.ch0601;

public class Singleton {
	
	//전체 프로그램에서 단 하나의 객체만 만들도로 보장하는 코딩 기법
//	private static Singleton singleton = new Singleton();
	private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			return singleton = new Singleton();
			
		}else {
			return singleton;
		}
		
	}
}
