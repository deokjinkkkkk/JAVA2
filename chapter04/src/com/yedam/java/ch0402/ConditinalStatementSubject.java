package com.yedam.java.ch0402;

public class ConditinalStatementSubject {
	public static void main(String[] args) {
		//문제1) 책 161페이지 5번
		//for문을 이용해서 다음과 같이 *를 출력하는 코
		
		String byul = "";
		for(int i = 1; i<=5 ;i++) {
			byul += "*";
			System.out.println(byul);
		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.println("*");
//			}
//			System.out.println();
//		}
		
		// 문제2) for문을 이용해서 1부터 100까지의 정수 중에서
		// 		 2의 배수가 아닌 숫자의 갯수를 구하세요.
		
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) continue;
			count++;
		}
		System.out.println(count);
		
		// 문제3) 
		
		Outter:for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.println(x +"," +y);
					break Outter;
				}
			}			
		}
		//문제4) do ~ while문 Math.random()함수를 이용
		//		1~10 의 정수 중 7이라는 수가 나올때까지 숫자를 출력
//		int ran = 0;
//		
//		do { 
//			ran= (int)(Math.random()*10) +1;
//			System.out.println(ran);
//			
//		}while (ran != 7);
		//문제5) 책 161페이지 3번
		//		while문과 Math,random() 함수를 이용
		//      2개의 주사위를 던졌을 때 숫자를 (숫자1, 숫자2)로 출력
		//		숫자의 합이 5일 경우에 종료, 아닌 경우에 계속 던짐
		//		최종으로 주사위를 몇번 던졌는지 횟수를 출력
		//		숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3),(3,2)
		int x = 0;
		int y = 0;
		count = 0;
//		do {
//			
//			x = (int)(Math.random()*6) + 1;
//			y = (int)(Math.random()*6) + 1;
//			System.out.println(x+","+y);
//			count++;
//		}
//		while(x+y != 5);
//		System.out.println(count);
		
		while(x+y != 5) {
			
			x = (int)(Math.random()*6) + 1;
			y = (int)(Math.random()*6) + 1;
			System.out.println(x+","+y);
			count++;
		}
		System.out.println(count+1);
		int total = 0;
		while(true) {
			x = (int)(Math.random()*6) + 1;
			y = (int)(Math.random()*6) + 1;
			total++;
			System.out.printf("(%d, %d)\n",x,y);
			if(x + y == 5) {
				break;
			}
		}
		System.out.println("주사위를 던진 횟수는 총 " + total + "번 입니다.");
		
		
	}
	
}
