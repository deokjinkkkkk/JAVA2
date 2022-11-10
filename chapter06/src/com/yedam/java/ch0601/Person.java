package com.yedam.java.ch0601;

public class Person {
	
	final String nation = "korea"; //final로 고정 해두었기 때문에 바꿀수 없다.
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
