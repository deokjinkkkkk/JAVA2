package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte 타입
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
//		byte var5 = 128;
		System.out.println(var1);
//		System.out.println(var5);
		
		
		long var6 = 1000000000000L; //자바에서 정수값은 int로 해놨기 때문에 잘못됐다고 판단한다
		long var7 = 1000000;		//그래서 int 값을 넘어설때는 L을 붙여준다
		
		//char 타입
		char v1 =65; //char가 가지는 문자는 ''로만 묶어야한다
		char v2 ='가'; // 글자는 1글자만 가능하다
		int v3 = v1;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//String
		String name ="홍길동"; //"":문자열
		String job ="프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3));
		
		// Char VS String
//		Char v4 ="A"; //Char는 "A" 한글자를 인지못함
		String v5 ="-";//String은 ''를 인지못함
		
		String str1 ="누군가\"안녕\"하면서 인사했다."; //""안에서 ""를 쓰고싶으면 \를 사용하면 된다.
		
		//float
		float num1 =3.14F;//float 은 뒤에 F를 붙여줘야한다.
		double num2 = 3.14;
		
		float varF =0.1234567890123456789F;
		double varD =0.1234567890123456789;//실수파일애서 정확하게 쓰고싶으면 double을 사용
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		boolean stop = (1 > 2);
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
	}								

}
