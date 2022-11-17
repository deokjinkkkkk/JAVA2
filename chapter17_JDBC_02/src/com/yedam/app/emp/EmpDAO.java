package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO {
	//전체조회
	List<EmpVO> selectAll();
	List<member> claSelectAll();
	//단건조회
	EmpVO selectOne(EmpVO empVO);
	
	//등록
	void insert(EmpVO empVO);
	void memInsert(member Member);
	//수정
	void update(EmpVO empVO);
	//삭제 : PK로 해주는게 좋다.
	void delete(int empNo);
	
	
}
