package com.yedam.java.ch0601;

public class Game {
	//객체를 생성한후 사용할 수있는 필드와 메소드를 인스턴스 멤버라고 한다.
	
	//필드
	//클래스 내부에서 값을 정해놓고 쓸수 있다.
	//객체로 만든다(인스턴스화로 된다)
	//인스턴스 필드
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;
	
	//생성자
	// *오버로딩* : 매개변수가 다르면 같은 생성자를 여려개 만들수 있다.(타입,개수 등등)
	public Game() {
		
	}
	
	public Game(String id) {
		this.id = id;
	}
	
	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
		//this는 인스턴스 멤버에 접근하여 사용하기 위한것
	}
	//메소드
	//인스턴스 메소드
	
	void getInfo() {
		System.out.println("GameName : " + gameName );
		System.out.println("id : " + id);
		System.out.println("password : " + passWd +"\n");
	}
}
