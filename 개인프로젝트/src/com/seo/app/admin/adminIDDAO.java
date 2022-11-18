package com.seo.app.admin;

import java.sql.SQLException;

import com.seo.app.common.DAO;

public class adminIDDAO extends DAO {
		private static adminIDDAO dao = null;
		private adminIDDAO() {}
		public static adminIDDAO getInstance() {
			if(dao == null) {
				dao = new adminIDDAO();
			}
			return dao;
		}
		public AdminID selectOne(AdminID adminId) {
			AdminID loginInfo = null;
			try {
				connect();
				String sql = "SELECT * FROM admin WHERE ID = '" + adminId.getId() +"'" ;
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					if(rs.getString("password").equals(adminId.getPassword())){
						loginInfo = new AdminID();
						loginInfo.setId(rs.getString("ID"));
						loginInfo.setPassword(rs.getString("password"));
						loginInfo.setRole(rs.getInt("role"));
				}else  {
					System.out.println("비밀번호가 일치하지 않습니다."); 
				}
				
				}else {
					System.out.println("아이디가 존재하지 않습니다.");
				}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return loginInfo;	
						
	}
}
		

