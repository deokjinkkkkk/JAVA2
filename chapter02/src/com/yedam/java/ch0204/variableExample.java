package com.yedam.java.ch0204;

import java.util.Scanner;

public class variableExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n",value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);

		double area = 3.14159*10*10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10,area);
		
		Scanner sc = new Scanner(System.in); //java.util.Scanner;
		
//		String str = sc.nextline(); //무조건 단독으로 사용해야한다.(엔터 값을 읽어준다)
//		System.out.println("입력 :" + str); //뒤에 nextline 있으면 nextline이 남아있는 엔터값을 읽고 그냥 지나간다.
		/*
		int x = sc.nextInt();//엔터값을 못본다 
		int y = sc.nextInt();
		System.out.println("입력 :" + (x+y)); // 공백을 두고 입력해야한다.
		*/
//		System.out.print("첫번째 :");
//		String x = sc.nextLine();
//		System.out.print("두번째 :");
//		String y = sc.nextLine();
//		int result =Integer.parseInt(x) + Integer.parseInt(y);
//		System.out.println("결과 :" +result);
		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
		
		//git관련 작업 추가 
	}  

}
