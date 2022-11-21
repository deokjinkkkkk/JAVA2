package com.seo.app.enrolment;

public class Member {
	private String memberName;
	private int memberNum;
	private String memberFromdate;
	private String memberTodate;
	private String memberProfessor;
	private int memberCredit;
	private int memberSnum;
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberFromdate() {
		return memberFromdate;
	}
	public void setMemberFromdate(String memberFromdate) {
		this.memberFromdate = memberFromdate;
	}
	public String getMemberTodate() {
		return memberTodate;
	}
	public void setMemberTodate(String memberTodate) {
		this.memberTodate = memberTodate;
	}
	public String getMemberProfessor() {
		return memberProfessor;
	}
	public void setMemberProfessor(String memberProfessor) {
		this.memberProfessor = memberProfessor;
	}
	public int getMemberCredit() {
		return memberCredit;
	}
	public void setMemberCredit(int memberCredit) {
		this.memberCredit = memberCredit;
	}
	public int getMemberSnum() {
		return memberSnum;
	}
	public void setMemberSnum(int memberSnum) {
		this.memberSnum = memberSnum;
	}
	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", memberNum=" + memberNum + ", memberFromdate=" + memberFromdate
				+ ", memberTodate=" + memberTodate + ", memberProfessor=" + memberProfessor + ", memberCredit="
				+ memberCredit + ", memberSnum=" + memberSnum + "]";
	}
	
}
