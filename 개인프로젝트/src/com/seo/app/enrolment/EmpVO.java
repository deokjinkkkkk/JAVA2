package com.seo.app.enrolment;

public class EmpVO {
	private int memberNo;
	private String memberName;
	private String gender;
	private String memberAddress;
	private String memberBirth;
	private String memberTel;
	
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	
	@Override
	public String toString() {
		return "EmpVO [memberNo=" + memberNo + ", memberName=" + memberName + ", gender=" + gender + ", memberAddress="
				+ memberAddress + ", memberBirth=" + memberBirth + ", memberTel=" + memberTel + "]";
	}
}
