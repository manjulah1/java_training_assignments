package com.cognologix.question4.entity;

public class Student {
	private Integer studentId;
	private String subject;
	private Integer marks;
	public Student(Integer studentId, String subject, Integer marks) {
		super();
		this.studentId = studentId;
		this.subject = subject;
		this.marks = marks;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", subject=" + subject + ", marks=" + marks + "]";
	}
	
}
