package com.yedam.java.ch0601;

public class Application {
	
	//필드
	int staticTest = 0;
	
	
	public static void main(String[] args) {
		Application ap = new Application();
		ap.staticTest = 2;
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlliper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(Shoes.totalCount);
		
		ConstantNo csno = new ConstantNo();
		System.out.println(csno.word);
		System.out.println(csno.words);
		
		System.out.println(ConstantNo.EARTH_ROUND);
		
		//은행 고객 정보를 관리하는 클래스
		//1) main 2) Customer 3) Bank
		//1) main-> 생성자를 통한 고객의 정보를 저장, 출력
		//2) Bank -> 해당은행의 금리를 저장
		//	(현재 잔액 + (현재 잔액 * 금리))
		//3) Customer ->  고객의 정보를 저장
		//이름,은행명, 계좌, 잔액의 필드
		//getInfo() : 입력한 정보 출력
		//withDraw() : 출금 할 때 정보를 출력
		
		Access access = new Access();
		
		//1)public
		access.free="public";
		access.free();
		//2) private
//		access.privacy = "privacy"
//		access.privacy();
		//3)protected
		access.parent = "parent";
		//4)default
		access.basic = "basic";
		
		Member mem = new Member();
		//1) mem의 인스턴스 필드에 접근 가능한지 확인
		//2) setter,getter로 데이터 입력 및 확인
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println("ID : " + mem.getId());
		System.out.println("Tel ; "+ mem.getTel());
		System.out.println("Age : " + mem.getAge());
		
	
	}
	
}
