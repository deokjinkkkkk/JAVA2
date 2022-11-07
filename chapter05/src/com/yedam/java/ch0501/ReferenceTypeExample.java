package com.yedam.java.ch0501;

public class ReferenceTypeExample {
	
	public static void main(String[] args) {
		// null과 NullPointerException
		String str = null;
//		System.out.println("길이 : "+ str.length());
		
		//String(문자열) 비교
		String strVar1 = "신미철";
		String strVar2 = "신미철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2가 문자열이 같음");
		}
		
		System.out.println("===========================");
		
		String strVar3 = new String("신미철");
		String strVar4 = new String("신미철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3와 strvar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strvar4는 문자열이 같음");
		}//equals 들고있는 값이 무엇인지 
	}
}
