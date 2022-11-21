package com.seo.app.enrolment;

import java.util.List;
import java.util.Scanner;

import com.seo.app.common.EmpDAO;
import com.seo.app.common.EmpDAOImpl;

public class EnrolmentManagement {
	Scanner sc = new Scanner(System.in);
	EmpDAO empDAO = EmpDAOImpl.getInstance();
	
	//수강신청 로그인
		public EnrolmentManagement() {
			while(true) {
				System.out.println("==================================");
				System.out.println(" 1.수강신청 2.수강조회 3.개강목록 4.종료");
				System.out.println("==================================");
				int menuNo = classMenuSelect();
				if(menuNo == 1) {
					//수강신청
					enrolment();
				}else if(menuNo == 2) {
					//수강조회
					enrolmentSelectOne();
				}else if(menuNo == 3) {
					//수강목록
					classSelectAll();
				}else if(menuNo == 4) {
					//종료
					end();
					break;
				}else {
					printErrorMessage();
				}
			}
			
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
	
	//개강목록조회
	private void classSelectAll() {
		List<classList> list = empDAO.claSelectAll();
		
		if(list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}
		for(classList classlist : list) {
			System.out.printf("과목번호 %d: 과목명 : %s, 수강시작 : %s, 수강종료 : %s, 담당교수 : %s, 학점 : %s \n",
								classlist.getClassNum(),classlist.getClassName(),classlist.getClassFromdate(),classlist.getClassTodate(),classlist.getClassProfessor(),classlist.getClassCredit());
		}
	}
	//수강조회
	private void enrolmentSelectOne() {
		Member findmem = inputmemInfo();
		List<Member> list = empDAO.memSelectOne(findmem);
		
		if(list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}
		
		for(Member classlist : list) {
			System.out.printf("과목번호 %d: 과목명 : %s, 수강시작 : %s, 수강종료 : %s, 담당교수 : %s, 학점 : %s \n",
					classlist.getMemberNum(),classlist.getMemberName(),classlist.getMemberFromdate(),classlist.getMemberTodate(),classlist.getMemberProfessor(),classlist.getMemberCredit());
		}
		
	}
	private Member inputmemInfo() {
		Member member = new Member();
		System.out.println("학생번호");
		member.setMemberSnum(Integer.parseInt(sc.nextLine()));
		return member;
		
	}
	//수강신청
	private void enrolment() {
		Member member = inputMemAll();
		empDAO.Enrolment(member);
		
	}
	private Member inputMemAll() {
		Member member = new Member();
		System.out.println("학생번호 > ");
		member.setMemberSnum(Integer.parseInt(sc.nextLine()));
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
