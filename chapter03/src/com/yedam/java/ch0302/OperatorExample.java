package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		//부호연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		byte  b = 100;
//		byte result3 = (byte)-b; //byte 에 -부호를 붙이고 싶으면 (byte)를 붙여야 한다(byte의 결과값은 int이기 때문에)
		int result3 = -b; //노란줄은 사용이 안되어있는경우에 나온다.
		System.out.println("result3 : " + result3);
		
		
	}
}
