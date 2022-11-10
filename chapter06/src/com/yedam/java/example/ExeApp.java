package com.yedam.java.example;

import java.util.Scanner;

public class ExeApp {
	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;
	int menuNo;
	
		public ExeApp(){
			while (true) {
				
				showMenu();
				System.out.println("메뉴 선택 > ");
				menuNo = Integer.parseInt(sc.nextLine());
				
				switch (menuNo) {
				case 1:
					setSize();				
					break;
				case 2:
					setInfo();				
					break;
				case 3:
						
					break;
				case 4:
					showInfo();
					break;
				case 5:
						
					break;
				case 6:
					
					break;

				default:
					break;
				}

				
				
			}
		}
		//메뉴 출력
		public void showMenu() {
			System.out.println("=========================================================");
			System.out.println("| 1. 회원 수 입력 2. 입력 3.단건  조회 4. 모든 조회 5. 삭제 6. 종료|");
			System.out.println("=========================================================");
			
		}
		public void setSize() {
			System.out.println("회원의 수 >");
			int count = Integer.parseInt(sc.nextLine());
			Bary = new Bank[count];
		}
		
		public void showInfo() {
			for(int i = 0; i<Bary.length; i++) {
				Bary[i].getInfo();
			}
		}
		//회원 정보 입력
		public void setInfo() {
			//배열 크기 만큼 반복문을 실행
			//회원 정보를 객체 담아서 배열에 저장
			for(int i =0; i < Bary.length; i++) {
			
			
			//빈 깡통
			Bank bank = new Bank();
						
			// 1. 계좌 번호 입력
			System.out.println("계좌 번호 >");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);
						
			// 2. 은행 이름 입력
			System.out.println("은행 입력 >");
			String bName = sc.nextLine();
			bank.setBank(bName);
						
			// 3. 예금
			System.out.println("금액 설정 >");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);
						
			// 4. 고객 이름 입력
			System.out.println("고객 이름 >");
			String name = sc.nextLine();
			bank.setName(name);
						
						
			// 계좌 번호, 은행 이름, 예금, 고객 이름 다 들어간 깡통
			Bary[i] = bank;
			}		
	}
}
