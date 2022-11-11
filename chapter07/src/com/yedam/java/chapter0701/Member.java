package com.yedam.java.chapter0701;

public class Member extends People{
	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn);
		this.stdNo =stdNo;
	}
}
// 부모 클래스에 생성자가 있으면 자식 클래스에서 super를 사용하여 부모클래스의 생성자를 가지고 와야한다.
// 부모 클래스에 생성자가 없으면 super를 생략하고 this를 사용하여 사용 가능하다.