package com.yedam.java.homework;

public class homework {

	public static void main(String[] args) {
		//문제1
		int x = 37;
		int y = 91;
		System.out.println("변수명1 :" + x + "," +"변수명2 :" + y);
		
		//문제2
		int res1 = y + x ;
		int res2 = y - x ;
		int res3 = y * x ;
		int res4 = y / x ;
		System.out.println("2.1)" + res1 +"\n" +"2.2)" + res2 + "\n" +"2.3)" + res3+ "\n"+ "2.4)" + res4);
		
		//문제3
		int var1 = 128;
		String var2 = "B";
		int var3 = 44032;
		long var4 = 100000000000L;
		double var5 = 43.93106;
		double var6 = 301.3;
		System.out.printf(var1 + ", int \n" +var2 + ", String \n" +var3 + ", int \n" +var4 + ", long \n" +var5 + ", double \n" +var6 + ", double \n" );
		
		//문제4
		byte a =35;
		byte b =25;
		int c =463;
		long d = 1000L;
		
		long result1 = a + c + d;
		System.out.println(result1);
		int result2 = a+ b+ c;
		System.out.println(result2);
		double e = 45.31;
		double result3 = c+ d+ e;
		System.out.println(result3);
		//문제 5
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		int int1 = intValue1 + intValue2;
		double dou1 = intValue4;
		String str1 =String.valueOf(charValue);
		String str2 =String.valueOf(intValue3) ;
		System.out.printf(str1 + int1 +str2 + strValue +"%.1f",dou1);
		//추가문제
		
		int value = 485;
		int total= 0;
		while(value > 0) {
			total += value %10;
			value /= 10;			
		}
		
			
		System.out.println("\n"+total);
		
	}

}
