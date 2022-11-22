package com.seo.app.common;

import java.util.List;

import com.seo.app.admin.AdminID;
import com.seo.app.admin.EmpVO;
import com.seo.app.enrolment.Member;
import com.seo.app.enrolment.classList;








public interface EmpDAO {
	//관리자 전체회원조회
	List<EmpVO> selectAll();
	//수강신청 개강목록조회
	List<classList> claSelectAll();
	//관리자 특정회원조회
	List<EmpVO> selectOne(EmpVO empVO);
	//수강신청 수강조회
	List<Member> memSelectOne(Member member);
	//관리자 회원등록
	void insert(EmpVO empVO);
	//수강신청 
	void Enrolment(Member member);
	//관리자 회원정보수정
	void update(EmpVO empVO);
	//관리자 회원삭제
	void delete(int empNo);
	
	
	
	
}
