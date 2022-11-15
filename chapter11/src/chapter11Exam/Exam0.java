package com.yedam.chapter11Exam;

import java.io.UnsupportedEncodingException;

public class Exam0 {
	public static void main(String[] args) {
		//1)문자열 뒤집기 - 입력되는 문자열을 뒤집어서 출력 
		//ex) input : abc, output :cba
		String str1 = "abc";
		
	
		
		
		for(int i = str1.length() -1; i >= 0 ;  i--) {
			System.out.print( str1.charAt(i));	
		}
		
		
		
		
		
		
		//2)문자열 개수 세기 -입력되는 문자열에서 알파벤과 숫자의 갯수를 구하기 -아스키 코드 이용
		//ex) input :1a2v4b, output : 숫지 3개 ,영어 3개
		//split(),getBytes()
		String str2 = "1a2v4b";
		int alphabet = 0;
		int number = 0;
		for(int i = 0; i < str2.length(); i++) {
			if(('a' <= str2.charAt(i) && str2.charAt(i) <='z')
			|| ('A' <= str2.charAt(i) && str2.charAt(i) <= 'Z')) {
				alphabet++;
			}else if ('0' <= str2.charAt(i) && str2.charAt(i) <='9') {
				number++;
			}
			
		}System.out.println("\n알파벳 : " + alphabet + " 숫자 : " + number);
		
		
		//3) 입력한 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성
		//-조건- 금년 기준으로 100년이 넘어간 경우는 제외한다.
		//(221114 -> 1922년 11월 14일 X , 2022년 11월 14일 O)
		//ex) input : 000510, output : 21살
		//태어난 년 월 일
		//년,월,일 나눠서 보기 substring
		//현재 년 월 일 
		
		String birth = "00000510";
		String now = "22221114";
		int birthYear = Integer.parseInt(birth.substring(2,4));
		int birthMonth =Integer.parseInt(birth.substring(4,6));
		int birthDay = Integer.parseInt(birth.substring(6,8));
		
		int nowYear = Integer.parseInt(now.substring(2,4));
		int nowMonth =Integer.parseInt(now.substring(4,6));
		int nowDay = Integer.parseInt(now.substring(6,8));
		
		int age = nowYear- birthYear;
		System.out.println(age);
		if(nowMonth <= birthMonth ) {
			age -=2;
			System.out.println("만 나이 : " + age);
		}else {
			age -= 1;
			System.out.println("만 나이 : " + age);
		}
		
	}
}	
		
	
