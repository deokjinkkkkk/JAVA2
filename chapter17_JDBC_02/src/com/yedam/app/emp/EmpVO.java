package com.yedam.app.emp;

import java.sql.Date;

public class EmpVO {
	
	private int empNo;
	private String brithDate;
	private String firstName;
	private String lastName;
	private String gender;
	private String hireDate;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getBrithDate() {
		return brithDate;
	}
	public void setBrithDate(String brithDate) {
		this.brithDate = brithDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "EmpVO [empNo=" + empNo + ", brithDate=" + brithDate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}
	
	
}
