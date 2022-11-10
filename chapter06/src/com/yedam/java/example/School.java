package com.yedam.java.example;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요 ");
		int count =Integer.parseInt(sc.nextLine());
		
		Student[] exam = new Student[count];
		
		for(int i=0; i< exam.length; i++) {
			Student examStudent = new Student();
			
			System.out.println("학생이름 > ");
			String sName = sc.nextLine();
			examStudent.setsName(sName);
			
			System.out.println("학생번호 > ");
			String sNo = sc.nextLine();
			examStudent.setsNo(sNo);
			
			System.out.println("국어점수 > ");
			int kor = Integer.parseInt(sc.nextLine());
			examStudent.setKor(kor);
			
			System.out.println("수학점수 > ");
			int math = Integer.parseInt(sc.nextLine());
			examStudent.setMath(math);
			
			System.out.println("영어점수 > ");
			int eng = Integer.parseInt(sc.nextLine());
			examStudent.setEng(eng);
			
			exam[i] = examStudent;
		}
		for(int i =0; i< exam.length; i++) {
			exam[i].getInfo();
//			System.out.println("학생 이름 >" + exam[i].getsName());
//			System.out.println("학생 이름 >" + exam[i].getsNo());
		}
	}
}
