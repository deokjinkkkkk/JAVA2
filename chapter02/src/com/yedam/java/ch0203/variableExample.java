package com.yedam.java.ch0203;

public class variableExample {
	public static void main(String[] args) {
		/*자동 타입 변환*/
		byte byteValue = 10;
//		char charValue = byteValue;
		int intValue = byteValue;
		System.out.println("intValue: " +intValue);
		//Char타입은 int 타입으로 자동변환 된다.
		char charValue ='가';
		intValue =charValue;
		System.out.println("intValue :" + intValue);
		
		intValue =50;
		long longValue =intValue;
		System.out.println("longValue : " +longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatvalue :" +floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue :" +doubleValue);
		//강제 타입 변환
		intValue =44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(longValue);
		
		doubleValue = 3.14;
		intValue =(int)doubleValue;
		System.out.println(intValue);//실수에서 정수로 값을 변환할때는 반올림 없이 소수점아래 삭제
		
		//정수 타입 연산
		byte result = 10 + 20;
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y; //byte result2 = x+y; 변수끼리는 자동으로 연산이 안된다.
		byte result3 = (byte)(x + y);
		System.out.println(result2 +", "+result3);
		
		char charValue1 = 'A'; //65
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		System.out.println("유니코드 : "+ intResult);
		System.out.println("출력문자 : "+ (char)intResult);
		
		byte value1 =10;
		int value2 =100;
		long value3 = 1000L;
		long longResult = value1 +value2 +value3;//int 로하면 오류뜸 long 타입이 섞이면 long타입으로 해줘야함
		
		int intV1 = 10;
		double doubleV1 =5.5;
		double plusV1 =intV1 + doubleV1;
		
		int intVar1 = 10; //intVar1 값이 정수 이기때문에 소수점아래는 날라간다.
		//int resultVar1 =intVar1/4;
		double resultVar1 =intVar1/4.0; //실수값을 구하기 위해 나누는 값 혹은 intvar1값을 실수로 바꿔준다.
		System.out.println("10/4 결과 : " +resultVar1); //소수점 이하 값을 구하려면 애초에 실수로 해야한다.
		
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1 / y1;
		System.out.println("1/2 결과 :" +result1); 
		
		//문자열 결합
		int value = 10 + 2 + 8 ;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8" ; //문자열이 들어가는 순간 문자열로 자동 변환되어서 문자열 결합연산을 사용한다.
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8 ;//컴퓨터는 앞에 있는것부터 계산하기 때문에 "2" 부터 문자열로 사용된다.
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8 ;
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8) ; //()를 통해서 먼저 계산하고 싶은걸 지정할수 있다.
		System.out.println(str4);
		
		//기본타입 <-> String
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0"); //숫자 타입이 아닌데 숫자로 바꿀려고 하면 오류가 발생한다.
		boolean cVar =Boolean.parseBoolean("true");
		
		System.out.println("a :" + aVar);
		System.out.println("b :" + bVar);
		System.out.println("c :" + cVar);
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23; //문자열은 공백을 인식하기 때문에 공백을 넣어 문자열로 바꿔준다.
		System.out.println(strV4);
		
	}
}
