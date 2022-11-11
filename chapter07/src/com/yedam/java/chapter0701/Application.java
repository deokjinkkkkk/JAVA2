package com.yedam.java.chapter0701;

public class Application {
	
	public static void main(String[] args) {
		Child child = new Child();
		
		//자식 클래스 고유 필드
		child.lastName = "paul";
		child.age =20;
		
		//부모 클래스 필드
		System.out.println(child.firstName + child.lastName);
		
//		System.out.println(child.job);
		
		//자식 클래스가 부모 클래스를 가지고 와서 사용할수 있다.
		//부모클래스는 여러명의 자식클래스를 둘수 있다.
		//자식클래스는 여러명의 부모클래스를 둘수 없다.
		//같은 클래스를 사용하는 부모가 있으면 어느 부모한테서 가지고 와야하는지 모르기 때문에 여러개의 부모클래스를 둘수없다.
		//private은 상속 대상에서 제외된다.
		//다른 패키지에 존재하면 default는 사용할수 없다.
		
		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
		
		//부모 클래스 필드 사용
		System.out.println("모델 : "+ dmb.model);
		System.out.println("색상 : "+ dmb.color);
		
		//자식 클래스 필드 사용
		System.out.println("채널 : "+ dmb.channel);
		
		//부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("안녕하세요 전 김또치입니다.");
		dmb.powerOff();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		
		Member member = new Member("고길동", "123123-456456", 1);
		
		//부모 객체의 필드 사용
		System.out.println("name : " + member.name);
		System.out.println("ssn : " + member.ssn);
		//자식 객체의 필드 사용
		System.out.println("memberNo : " + member.stdNo);
		
		Child cd = new Child();
		
		cd.method1();
		cd.method2();
		cd.method3();
		
		Compute com = new Compute();
		
		double result = com.areaCircle(10);
		System.out.println("result : "+ result);
		
		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeoff();
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.NORMAL;
		
		sa.fly();
		
		sa.land();
		
		Child chd = new Child();
		//Parent parent = new Child();
		//부모 클래스에 있는 필드, 메소드르 사용을 하되 
		//만약 자식 클래스에 오버라이딩이 되어 있는 메소드가 존재 한다면
		//부모 클래스에 정의된메소드를 사용하지 않고 자식 클래스에 있는 메소드
		Parent parent = chd; //부모 타입으로 변경
		
		parent.method1();//자식 객체에서 재정의 된 경우에는 부모 타입이더라도 자식 객체에서 불러 올수 있다.
		parent.method2();
//		parent.method3();//자식 객체를 불러오려 하지만 자식 타입에서  부모 타입으로 변경 했기 때문에 실행되지 않는다.
		
		
		
	}
}
