package com.yedam.chapter0801;

public interface RemoteControl {
	
	//상수
	//public static final PI = 3.14;
	
	//추상메소드
	
	//public void method1();
	
	//기본 설계도
	//대규모 프로젝트 -> 번역
	//A : 영어 -> 한글 ( 메소드 : 번역)
	//B : 영어 -> 일본어 ( 메소드 : method1())
	//C : 영어 -> 중국어 ( 메소드 : method2()) 
	
	//프로젝트 완료
	//똑같은 메소드 이름으로 구현
	
	//public staic final int MAX_VOLUME = 10; 인터페이스 에서는 static final 을 생략해서 쓴다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드
	//public abstract void turnOn();
	//인터페이스 에서는 abstract 가 생략할수 있다.
	//기본적으로 이것을 구현해라
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//상속 받는것을 구현객체
	//상속의 자식 클래스를 구현클래스
	
	
}
