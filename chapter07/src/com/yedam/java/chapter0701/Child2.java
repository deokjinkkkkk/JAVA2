package com.yedam.java.chapter0701;

import com.yedam.java.chapter07.parent; //해당 패키지를 사용 가능하게해준다.

public class Child2 extends parent{
	
	//필드
	
	//생성자
	
	//메소드
	void getInfo() {
		System.out.println(firstName + lastName + bloodType + age );
	}
	//protected 를 사용해주면 다른 패키지에 있는 클래스를 사용할수 있게 해준다.
	//public은 모든 곳에서 사용 가능하다.
}
