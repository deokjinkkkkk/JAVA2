package com.seo.app.admin;

import java.util.Scanner;

import com.seo.app.enrolment.EnrolmentManagement;


public class Login {
	Scanner sc = new Scanner(System.in);
	private static AdminID loginInfo = null;
	public static AdminID getLoginInfo() {
		return loginInfo;
	}
	public Login() {
	while(true) {
		//메뉴출력
		menuPrint();
		//메뉴선택
		int menuNo =menuSelect();
		//각 메뉴의 기능을 실행
		if(menuNo == 1) {
			//관리자 로그인
			
			login();
			
			
		}else if(menuNo == 2){
			//수강신청
			new EnrolmentManagement();
		}else if(menuNo == 3) {
			//종료
			end();
			break;
		}else {
			//메뉴 잘못입력
			printErrorMessage();
		}
	}
}
	
	private void login() {
		AdminID inputInfo = inputadminId();
		loginInfo = adminIDDAO.getInstance().selectOne(inputInfo);
		if(loginInfo == null)return;
		new GM().admin();		
		
	}
		private AdminID inputadminId() {
		AdminID info = new AdminID();
		System.out.println("아이디 > ");
		info.setId(sc.nextLine());
		System.out.println("비밀번호 > ");
		info.setPassword(sc.nextLine());
		return info;
	}
		//시작메뉴출력
		private void menuPrint() {
			System.out.println("=============================");
			System.out.println(" 1.관리자 로그인 2.수강신청 3.종료 ");
			System.out.println("=============================");
		}
		//시작메뉴선택
		private int menuSelect() {
			int menuNo = 0;
			try {
				menuNo = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("메뉴는 숫자로 구성되어 있습니다.");
			}
			return menuNo;
		}
		//에러메시지
		private void printErrorMessage() {
			System.out.println("=======================");
			System.out.println(" 메뉴를 잘못 입력하였습니다.");
			System.out.println("=======================");
			
		}
		//종료메시지
		private void end() {
			System.out.println("===============================");
			System.out.println("프로그램을 종료합니다.");
			System.out.println("===============================");
			
		}
}
