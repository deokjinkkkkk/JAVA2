package com.seo.app.common;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.seo.app.admin.AdminID;
import com.seo.app.admin.EmpVO;
import com.seo.app.enrolment.Member;
import com.seo.app.enrolment.classList;


public class EmpDAOImpl extends DAO implements EmpDAO {
	private static EmpDAO instance = null;
	
	public static EmpDAO getInstance() {
		if(instance == null)
			instance = new EmpDAOImpl();
		return instance;
	}
	
	//전체회원조회
	
	@Override
	public List<EmpVO> selectAll() {
		List<EmpVO> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM Profile";
			rs = stmt.executeQuery(sql);
			int count = 0;
			while(rs.next()) {
				EmpVO empVO = new EmpVO();
				empVO.setMemberNo(rs.getInt("Member_num"));
				empVO.setMemberName(rs.getString("Member_name"));
				empVO.setGender(rs.getString("gender"));
				empVO.setMemberAddress(rs.getString("Member_address"));
				empVO.setMemberBirth(rs.getString("Member_birth"));
				empVO.setMemberTel(rs.getString("Member_tel"));
				
				list.add(empVO);
				
				if(++count >= 20) break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return list;
	}
	
	//특정회원조회
	
	@Override
	public List<EmpVO> selectOne(EmpVO empVO) {
		EmpVO findVO = null;
		List<EmpVO> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM Profile WHERE Member_name= '" + empVO.getMemberName() + "'";
			
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				findVO = new EmpVO();
				findVO.setMemberNo(rs.getInt("Member_num"));
				findVO.setMemberName(rs.getString("Member_name"));
				findVO.setGender(rs.getString("gender"));
				findVO.setMemberAddress(rs.getString("Member_address"));
				findVO.setMemberBirth(rs.getString("Member_birth"));
				findVO.setMemberTel(rs.getString("Member_tel"));
				
				list.add(findVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
		
	}
	//회원등록
	@Override
	public void insert(EmpVO empVO) {
		try {
			connect();
			String sql = "INSERT INTO Profile VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getMemberNo());
			pstmt.setString(2, empVO.getMemberName());
			pstmt.setString(3, empVO.getGender());
			pstmt.setString(4, empVO.getMemberAddress());
			pstmt.setString(5, empVO.getMemberBirth());
			pstmt.setString(6, empVO.getMemberTel());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}
	//회원정보 수정
	@Override
	public void update(EmpVO empVO) {
		try {
			connect();
			String sql ="UPDATE Profile SET Member_address = ? , Member_tel = ? WHERE Member_num= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empVO.getMemberAddress());
			pstmt.setString(2, empVO.getMemberTel());
			pstmt.setInt(3, empVO.getMemberNo());
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			}else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}
	//회원삭제
	@Override
	public void delete(int memberNo) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM Profile WHERE Member_num = " + memberNo;
			
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			}else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}
	//개강목록 조회
	@Override
	public List<classList> claSelectAll() {
		List<classList> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM class";
			rs = stmt.executeQuery(sql);
			int count = 0;
			while(rs.next()) {
				classList classlist = new classList();
				classlist.setClassName(rs.getString("class_name"));
				classlist.setClassNum(rs.getInt("class_num"));
				classlist.setClassFromdate(rs.getString("class_fromdate"));
				classlist.setClassTodate(rs.getString("class_todate"));
				classlist.setClassProfessor(rs.getString("class_professor"));
				classlist.setClassCredit(rs.getInt("class_credit"));
				
				list.add(classlist);
				
				if(++count >= 20) break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return list;
	}
	//수강조회
	
	@Override
	public List<Member> memSelectOne(Member member) {
		
		List<Member> list = new ArrayList<>();
		try {
			connect();
			
			//JOIN을 사용하여 class 테이블과 Profile 테이블의 내용을 가지고 온다.
			String sql = "SELECT "
						+"ME.Member_num, "
						+"ME.class_num, "
						+"PR.Member_name, "
						+"CL.class_name, "
						+"CL.class_credit "
						+"FROM member ME "
						+"JOIN profile PR "
						+"ON ME.Member_num = PR.Member_num "
						+"JOIN class CL "
						+"ON ME.class_num = CL.class_num "
						+"WHERE ME.Member_num = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMemberNum()); //WHERE 에 넣어줄 Member_num을 가져온다.
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member findVO = new Member();
				findVO.setMemberNum(rs.getInt("Member_num"));
				findVO.setClassNum(rs.getInt("class_num"));
				findVO.setClassName(rs.getString("class_name"));
				findVO.setClassCredit(rs.getInt("class_credit"));
				findVO.setMemberName(rs.getString("Member_name"));
				
				list.add(findVO);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	//수강신청
	@Override
	public void Enrolment(Member member) {
		try {
			connect();
			String sql = "INSERT INTO member VALUES (?,?)";
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setInt(1, member.getClassNum());
			pstmt.setInt(2, member.getMemberNum());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}

	

	

	
	

}
