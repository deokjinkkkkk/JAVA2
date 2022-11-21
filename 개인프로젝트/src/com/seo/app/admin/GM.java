package com.seo.app.admin;

import java.util.List;
import java.util.Scanner;

import com.seo.app.common.EmpDAO;
import com.seo.app.common.EmpDAOImpl;
import com.seo.app.enrolment.EmpVO;
import com.seo.app.enrolment.classList;

public class GM {
	protected Scanner sc = new Scanner(System.in);
	EmpDAO empDAO = EmpDAOImpl.getInstance();
	

	public void admin() {
		while(true) {
			System.out.println("============================================================");
			System.out.println(" 1.회원등록 2.회원정보수정 3.회원삭제 4.전체회원조회 5.특정회원조회 6.종료");
			System.out.println("============================================================");
			int menuNo = classMenuSelect();
			if(menuNo == 1) {
				//회원등록
				insert();
			}else if(menuNo == 2) {
				//회원정보수정
				update();
			}else if(menuNo == 3) {
				//회원삭제
				delete();
			}else if(menuNo == 4) {
				//전체회원조회
				selectAll();
			}else if(menuNo == 5) {
				//특정회원조회
				SelectOne();
			}else if(menuNo == 6) {
				//종료
				end();
				break;
			}else {
				printErrorMessage();
			}
		}
	}
	private int classMenuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("메뉴는 숫자로 구성되어 있습니다.");
		}
		return menuNo;
	}
	//종료메시지
		private void end() {
			System.out.println("===============================");
			System.out.println("프로그램을 종료합니다.");
			System.out.println("===============================");
		}
	//에러메시지
		private void printErrorMessage() {
			System.out.println("=======================");
			System.out.println(" 메뉴를 잘못 입력하였습니다.");
			System.out.println("=======================");
			
		}
	//특정회원조회
		//회원이름으로 조회가능하도록 해야함
		private void SelectOne() {
			EmpVO findmem = inputEmpInfo();
			List<EmpVO> list = empDAO.selectOne(findmem);
			
			if(list.isEmpty()) {
				System.out.println("정보가 존재하지 않습니다.");
				return;
			}
			
			for(EmpVO empVO : list) {
				System.out.printf("%s: %s, %s, %s, %s \n",empVO.getMemberName(),empVO.getGender(),
									empVO.getMemberBirth(),empVO.getMemberAddress(),empVO.getMemberTel());
			}
			
		}
		
		private EmpVO inputEmpInfo() {
			EmpVO empVO = new EmpVO();
			System.out.println("회원이름 > ");
			empVO.setMemberName(sc.nextLine());
			return empVO;
		}
		
		//전체회원조회
		private void selectAll() {
			List<EmpVO> list = empDAO.selectAll();
			
			if(list.isEmpty()) {
				System.out.println("정보가 존재하지 않습니다.");
				return;
			}
			for(EmpVO empVO : list) {
				System.out.printf("%s: %s, %s, %s, %s \n",empVO.getMemberName(),empVO.getGender(),
									empVO.getMemberBirth(),empVO.getMemberAddress(),empVO.getMemberTel());
			}
			
		}
		//회원삭제
		private void delete() {
			int memberNo = inputEmpNo();
			empDAO.delete(memberNo);
			
		}
		private int inputEmpNo() {
			int memberNo = 0;
			try {
				System.out.println("회원번호 > ");
				memberNo = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("회원번호는 숫자로 구성되어 있습니다.");
			}
			return memberNo;
		}
		//회원정보수정
		private void update() {
			EmpVO empVO = inputUpdateInfo();
			empDAO.update(empVO);
			
		}
		private EmpVO inputUpdateInfo() {
			EmpVO empVO = new EmpVO();
			System.out.println("회원번호 > ");
			empVO.setMemberNo(Integer.parseInt(sc.nextLine()));
			System.out.println("회원주소 > ");
			empVO.setMemberAddress(sc.nextLine());
			System.out.println("회원 휴대폰 번호 > ");
			empVO.setMemberTel(sc.nextLine());
			return empVO;
		}
		//회원등록
		private void insert() {
			EmpVO empVO = inputEmpAll();
			empDAO.insert(empVO);
			
		}
		private EmpVO inputEmpAll() {
			EmpVO empVO = new EmpVO();
			System.out.println("회원번호 > ");
			empVO.setMemberNo(Integer.parseInt(sc.nextLine()));
			System.out.println("회원명 > ");
			empVO.setMemberName(sc.nextLine());
			System.out.println("성별 > ");
			empVO.setGender(sc.nextLine());
			System.out.println("회원주소 > ");
			empVO.setMemberAddress(sc.nextLine());
			System.out.println("회원 생일 > ");
			empVO.setMemberBirth(sc.nextLine());
			System.out.println("회원 휴대폰 번호 > ");
			empVO.setMemberTel(sc.nextLine());
			return empVO;
			
		}
}
