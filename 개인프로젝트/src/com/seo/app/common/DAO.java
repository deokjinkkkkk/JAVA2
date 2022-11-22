package com.seo.app.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import com.seo.app.admin.AdminID;
import com.seo.app.enrolment.Member;


public class DAO {
	//DB에 연결한다.
	private String jdbcDriver = "org.sqlite.JDBC";
	private String jdbcUrl = "jdbc:sqlite:/C:/Users/admin/Desktop/Project/서덕진.db";
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public void connect() {
		try {
			Class.forName(jdbcDriver);
			
			conn =DriverManager.getConnection(jdbcUrl);
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC DRIVAER LOADING FAIL");
		}catch(SQLException e) {
			System.out.println("DATABASE CONNECTION FAIL");
		}
	}
	//DB와 연결을 끊어준다.
	public void disconnect() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		}catch(SQLException e) {
		 System.out.println("정상적으로 자원히 해제 되지 않았습니다.");
		}
	}
	
	


}

