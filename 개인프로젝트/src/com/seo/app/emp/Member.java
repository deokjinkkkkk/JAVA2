package com.seo.app.emp;

public class Member {
	private String className;
	private int classNum;
	private int memberNum;
	private String memberName;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return "member [className=" + className + ", classNum=" + classNum + ", memberNum=" + memberNum
				+ ", memberName=" + memberName + "]";
	}
	
}
