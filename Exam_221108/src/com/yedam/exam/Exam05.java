package com.yedam.exam;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] dice = null; //주사위의 각 숫자별로 몇번씩 나왔는지를 기록
							// index 는 변동이 없다 	 => 주사위의 각 숫자별로		
		int size = 0;				   // 각 index별로 가지는 값은 변동된다.
							// 주사위의 각 숫자가 가지는 횟수 
		while(run) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.print("메뉴 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) { // 주사위 크기 입력
				System.out.println("주사위 크기 > ");
				size = Integer.parseInt(sc.nextLine());
				if(size >= 5 && size <=10) {
					dice = new int[size];
				}else {
					System.out.println("주사위 크기는 5 ~ 10 사이만 가능합니다.");
					size = 0;
				}
			}else if(selectNo == 2) { // 주사위 굴리기 -> 주 기능
				int count = 0;
				while(true) { //index = num -1 
					
					int num = (int)(Math.random() * size ) + 1;
					count++;
					dice[num-1] = dice[num-1] + 1;// 
					if(num == 5) break;
				}
			System.out.println("5가 나올 떄까지 주사위를 "+ count+ "번 굴렸습니다.");
			}else if(selectNo == 3) { // 결과 보기
				
				for(int i=0; i<dice.length; i++) {
					System.out.println((i+1) + "은" + dice[i] + "번 나왔습니다.");
				}
				
			}else if(selectNo == 4) { // 가장 많이 나온 수
				
				int maxCount = 0; //나온 횟수
				int maxIndex = 0; //나온 인덱스
				for(int i=0; i<dice.length; i++) {
					if(maxCount < dice[i]) {
						maxCount = dice[i];
						maxIndex = i;
					}
				}
				System.out.println("가장 많이 나온 수는 " + (maxIndex+1) + "입니다.");
				
			}else if(selectNo == 5) { // 종료
				run = false;
			}else { //메뉴(1~5) 외 입력 시
				System.out.println("메뉴를 잘못 입력하였습니다.");
				System.out.println("확인 후 다시 입력하시기 바랍니다.");
			}
		}
		System.out.println("프로그램 종료하였습니다.");
	}

}
