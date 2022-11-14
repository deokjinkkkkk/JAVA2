package com.yedam.chapter11;

import java.util.HashMap;

public class MemberExample {
	public static void main(String[] args) {
		//객체 동등 비교 조건 -> 값이 같다 or 다르다
		//강제 타입 변환
		//Object -> 여러 클래스
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2 는 동등");
		}else {
			System.out.println("obj1과 obj2 는 같지 않음");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3 는 동등");
		}else {
			System.out.println("obj1과 obj3 는 같지 않음");
		}
		
		HashMap<Member, String> member = new HashMap<>();
		//new Member("1") -> 주소가 "1"의 10이고, 해쉬코드 1
		member.put(new Member("1"), "홍길동");
		//new Member("1") -> 주소가 "1"의 10이고, 해쉬코드 1
		//매개변수 "1"의 주소는 String 이기 때문에 같은 주소를 가진다.
		String value = member.get(new Member("1"));
		System.out.println(value);
	}
}
