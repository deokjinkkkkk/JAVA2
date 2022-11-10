package com.yedam.java.homework;

public class Student {
	
	//필드
	
	private String name;
	
	private String schoolName;
	
	private int studentNumber;
	
	private int studentClass;
	
	private int kor;
	private int Eng;
	private int mat; 
	
	//생성자
	
	public String getName() {
		return name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return Eng;
	}
	public int getMat() {
		return mat;
	}
	
	//메소드
	
	// getInfo() 학생의 내용을 출력할 수 있는 기능
}	
