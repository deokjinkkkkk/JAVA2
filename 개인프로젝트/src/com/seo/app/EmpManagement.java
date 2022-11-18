package com.seo.app;

import java.util.List;
import java.util.Scanner;

import com.seo.app.admin.AdminID;
import com.seo.app.emp.EmpDAO;
import com.seo.app.emp.EmpDAOImpl;
import com.seo.app.emp.EmpVO;
import com.seo.app.emp.Member;
import com.seo.app.emp.classList;

public class EmpManagement {
	Scanner sc = new Scanner(System.in);
	EmpDAO empDAO = EmpDAOImpl.getInstance();
	
	
	
	
	
	
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
	//수강신청 로그인
	private void ClassEnrolment() {
		while(true) {
			System.out.println("==================================");
			System.out.println(" 1.수강신청 2.수강조회 3.수강목록 4.종료");
			System.out.println("==================================");
			int menuNo = classMenuSelect();
			if(menuNo == 1) {
				//수강신청
				memInsert();
			}else if(menuNo == 2) {
				//수강조회
				memSelectOne();
			}else if(menuNo == 3) {
				//수강목록
				claSelectAll();
			}else if(menuNo == 4) {
				//종료
				end();
				break;
			}else {
				printErrorMessage();
			}
		}
		
	}
	//수강목록조회
	private void claSelectAll() {
		List<classList> list = empDAO.claSelectAll();
		
		if(list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}
		for(classList classlist : list) {
			System.out.printf("수강번호 %d: 수강명 : %s, 수강시작 : %s, 수강종료 : %s, 담당교수 : %s \n",
								classlist.getClassNum(),classlist.getClassName(),classlist.getClassFromdate(),classlist.getClassTodate(),classlist.getClassProfessor());
		}
	}
	//수강조회
	private void memSelectOne() {
		Member findmem = inputmemInfo();
		Member member = empDAO.memSelectOne(findmem);
		if(member == null) {
			System.out.println(findmem.getMemberName() + "회원이 존재하지 않습니다.");
		}else {
			System.out.println("조회결과 > ");
			System.out.println(member);
		}
		
	}
	private Member inputmemInfo() {
		Member member = new Member();
		System.out.println("학번 > ");
		member.setMemberNum(Integer.parseInt(sc.nextLine()));
		System.out.println("학생이름");
		member.setMemberName(sc.nextLine());
		return member;
		
	}
	//수강신청
	private void memInsert() {
		Member member = inputMemAll();
		empDAO.memInsert(member);
		
	}
	private Member inputMemAll() {
		Member member = new Member();
		System.out.println("수강강좌 > ");
		member.setClassName(sc.nextLine());
		System.out.println("수강번호 > ");
		member.setClassNum(Integer.parseInt(sc.nextLine()));
		System.out.println("학번 > ");
		member.setMemberNum(Integer.parseInt(sc.nextLine()));
		System.out.println("학생이름");
		member.setMemberName(sc.nextLine());
		return member;
	}
	//수강신청 메뉴선택
	private int classMenuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("메뉴는 숫자로 구성되어 있습니다.");
		}
		return menuNo;
	}
	
	
	
	
}
