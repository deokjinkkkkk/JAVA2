package com.yedam.java.chapter13.set;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	@Override
	public int hashCode() {
		//name = String
		//Member member = new Member("yedam", 1);
		//Member member2 = new Member("yedam", 1);
		//Member member3 = new Member("yedam", 4);
		//'yedam" -> 2
		//age -> 1
		// 2 + 1 = 3;
		
		//"yedam" -> 2;
		// age -> 4
		// 최종 hashcode() = 2 + 4
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
}
