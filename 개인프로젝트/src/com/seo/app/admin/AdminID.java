package com.seo.app.admin;

public class AdminID {
	
	private String id;
	private String password;
	private int role;
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getRole() {
		return role;
	}



	public void setRole(int role) {
		this.role = role;
	}



	@Override
	public String toString() {
		String info = "";
		
		if(role == 0) {
			info = "관리자 계정 : " + id;
		}else {
			info = "일반 계정 : " + id;
		}
		
		return info;
	}
}
