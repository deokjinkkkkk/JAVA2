package com.seo.app.emp;

import java.util.ArrayList;
import java.util.List;

import com.seo.app.common.DAO;


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
	public EmpVO selectOne(EmpVO empVO) {
		EmpVO findVO = null;
		try {
			connect();
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM Profile WHERE emp_no = " + empVO.getMemberNo();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				findVO = new EmpVO();
				empVO.setMemberNo(rs.getInt("Member_num"));
				empVO.setMemberName(rs.getString("Member_name"));
				empVO.setGender(rs.getString("gender"));
				empVO.setMemberAddress(rs.getString("Member_address"));
				empVO.setMemberBirth(rs.getString("Member_birth"));
				empVO.setMemberTel(rs.getString("Member_tel"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return findVO;
		
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
			String sql ="UPDATE Profile SET Member_address = ? WHERE Member_tel= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empVO.getMemberAddress());
			pstmt.setString(2, empVO.getMemberTel());
			
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
			String sql = "DELETE FROM Profile WHERE Memeber_num = " + memberNo;
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
	//수강목록 조회
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
	public Member memSelectOne(Member member) {
		Member findVO = null;
		try {
			connect();
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM member WHERE member_num = " + member.getMemberNum();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				findVO = new Member();
				member.setMemberNum(rs.getInt("Member_num"));
				member.setMemberName(rs.getString("Member_name"));
				member.setClassName(rs.getString("class_name"));
				member.setClassNum(rs.getInt("class_num"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return findVO;
	}
	//수강신청
	@Override
	public void memInsert(Member member) {
		try {
			connect();
			String sql = "INSERT INTO member VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMemberNum());
			pstmt.setString(2, member.getMemberName());
			pstmt.setString(3, member.getClassName());
			pstmt.setInt(4, member.getClassNum());
			
			
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
	//로그인
	@Override
	public List<AdminID> login() {
		List<AdminID> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM class admin WHERE ";
			rs = stmt.executeQuery(sql);
			int count = 0;
			while(rs.next()) {
				AdminID adminid = new AdminID();
				
				
				list.add(adminid);
						
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return list;
	}

}
