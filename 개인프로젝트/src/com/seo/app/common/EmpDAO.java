package com.seo.app.common;

import java.util.List;

import com.seo.app.admin.AdminID;
import com.seo.app.enrolment.EmpVO;
import com.seo.app.enrolment.Member;
import com.seo.app.enrolment.classList;








public interface EmpDAO {
	
	List<EmpVO> selectAll();
	List<classList> claSelectAll();
	
	List<EmpVO> selectOne(EmpVO empVO);
	List<Member> memSelectOne(Member member);
	
	void insert(EmpVO empVO);
	void Enrolment(Member member);
	
	void update(EmpVO empVO);
	
	void delete(int empNo);
	
	
	
	
}
