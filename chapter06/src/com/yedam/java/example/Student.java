package com.yedam.java.example;

public class Student {
	
	//1)각 필드를 저장할 수 있는 getter, setter 작성
	//2)모든 정보를 출력할수 있는 메소드 하나 작성 getifo
	//3)School 클래스 만들고 main을 작성해서 학생의 정보를 넣는 프로그램
	//4)학생 수를 입력 받고, 각 필드의 데이터를 받아와서  학생 정보가 담긴 프로그램
	//5)모든 학생정보를 출력.
	
	//필드
	private String sName;
	private String sNo;
	private int kor;
	private int math;
	private int eng;
	//생성자
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//메소드
	public void getInfo() {
		System.out.println("========================");
		System.out.println("학생이름 : " + sName);
		System.out.println("학생번호 : " + sNo);
		System.out.println("국어점수 : " + kor);
		System.out.println("수학점수 : " + math);
		System.out.println("영어점수 : " + eng);
	}
}
