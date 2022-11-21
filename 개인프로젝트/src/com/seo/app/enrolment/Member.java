package com.seo.app.enrolment;

public class Member {
	private int classNum;
	private int memberNum;
	private int classCredit;
	private int classSnum;
	private String className;
	private String memberName;

	public int getClassCredit() {
		return classCredit;
	}

	public void setClassCredit(int classCredit) {
		this.classCredit = classCredit;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
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

	public int getClassSnum() {
		return classSnum;
	}

	public void setClassSnum(int classSnum) {
		this.classSnum = classSnum;
	}

	@Override
	public String toString() {
		return "Member [classNum=" + classNum + ", memberNum=" + memberNum + ", classCredit=" + classCredit
				+ ", classSnum=" + classSnum + ", className=" + className + ", memberName=" + memberName + "]";
	}

}