package com.seo.app.emp;

import java.util.List;

import com.seo.app.admin.AdminID;








public interface EmpDAO {
	
	List<EmpVO> selectAll();
	List<classList> claSelectAll();
	
	EmpVO selectOne(EmpVO empVO);
	Member memSelectOne(Member member);
	
	void insert(EmpVO empVO);
	void memInsert(Member member);
	
	void update(EmpVO empVO);
	
	void delete(int empNo);
	
	
	
}
