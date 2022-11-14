package com.yedam.chapter11Exam;

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
		byte[] byte1 = null;
		String str2 = "1a2v4b";
		byte1 = str2.getBytes("EUC-KR");
		System.out.println();
//		if(byte1 )
//		String[] strAry = str2.split();
//		for(String temp : strAry) {
//			System.out.println(temp);
//		}
//		
		
		//3) 입력한 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성
		//-조건- 금년 기준으로 100년이 넘어간 경우는 제외한다.
		//(221114 -> 1922년 11월 14일 X , 2022년 11월 14일 O)
		//ex) input : 000510, output : 21살
		
	}
}
