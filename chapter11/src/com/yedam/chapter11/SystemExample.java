package com.yedam.chapter11;

public class SystemExample {
	public static void main(String[] args) {
		//System.exit()
//		for(int i = 0; i<10; i ++) {
//			System.out.println(i);
//			if(i == 5) {
//				System.exit(0); //완전 프로그램이 종료가 되었다.
//			}
//		}
//		System.out.println("프로그램 종료");
		
		//현재 시각 읽기
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1 ; i<=100000; i++) {
			sum += 1;
		}
		
		long time2 =System.nanoTime();
		
		System.out.println("sum ; " + sum);
		System.out.println("계산 사간 : " + (time2 -time1) + "나노초가 소요됨.");
		
		long time3 = System.currentTimeMillis();
		System.out.println(time3);
	}
}
