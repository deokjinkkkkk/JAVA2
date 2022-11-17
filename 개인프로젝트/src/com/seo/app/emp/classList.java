package com.seo.app.emp;

public class classList {
	private String className;
	private int classNum;
	private String classFromdate;
	private String classTodate;
	private String classProfessor;
	
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
	public String getClassFromdate() {
		return classFromdate;
	}
	public void setClassFromdate(String classFromdate) {
		this.classFromdate = classFromdate;
	}
	public String getClassTodate() {
		return classTodate;
	}
	public void setClassTodate(String classTodate) {
		this.classTodate = classTodate;
	}
	public String getClassProfessor() {
		return classProfessor;
	}
	public void setClassProfessor(String classProfessor) {
		this.classProfessor = classProfessor;
	}

	@Override
	public String toString() {
		return "classList [className=" + className + ", classNum=" + classNum + ", classFromdate=" + classFromdate
				+ ", classTodate=" + classTodate + ", classProfessor=" + classProfessor + "]";
	}
	
	
}
