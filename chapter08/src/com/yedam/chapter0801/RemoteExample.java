package com.yedam.chapter0801;

public class RemoteExample {
	public static void main(String[] args) {
		
		//TV를 객체로 해서 만듦.
		RemoteControl rc = new Television();
		//인터페이스를 활용해서 만든것
		//rc = new Audio(); //새로 덮어 씌움(Television -> Audio)
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		Search search = new Television();
		
		search.serach("google.com");
		
		
		Television tv = new Television();
		//자기 자신만을 활용해서 만든것
		tv.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		// 추상 클래스 vs 인터페이스
		// 추상 클래스(extends) -> 필드, 생성자 ,메소드 (하나의 부모만 섬길수 있다.)(부모 클래스를 객체화 한다.)
		// 인터페이스(implement) -> 상수, 추상 메소드 (내가 만들어놓은 구현 클래스에 내가 원하는것을 상속받아서 쓸수 있다.)(기능위주로 쓸떄)
		
	}
}
