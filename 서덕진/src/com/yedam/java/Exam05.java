package com.yedam.java;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		boolean run =true;
		Scanner sc =new Scanner(System.in);
		int[] diceList = null;
		int[] numList = null;
		int count = 0;
		while(run) {
		System.out.println();
		System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
		System.out.println();
		System.out.println("메뉴 > ");
		int selectNo = Integer.parseInt(sc.nextLine());
		
		if(selectNo ==1) {
			System.out.println("주사위 크기");
			int num = Integer.parseInt(sc.nextLine());
			if(num >=5 && num <= 10 ) {
				numList = new int[num];
			}else {
				System.out.println("범위를 벗어 났습니다.");
			}
			System.out.println(numList.length);
			count = 0;
		}else if(selectNo ==2){	
						
			while(true) {
				int dice = (int)(Math.random()*numList.length)+1;				
				count++;
				if (dice == 5) {
				break;}
				
			}System.out.println("5가 나올떄까지 주사위를 " +count +"번 굴렸습니다." );
		}else if(selectNo ==3){
			
		}else if(selectNo ==4){
			
		}else if(selectNo ==5){
			run = false;
			
		}else {
			System.out.println("정해진 메뉴를 입력하지 않았습니다.");
		}
		}System.out.println("프로그램 종료");
	}
}
