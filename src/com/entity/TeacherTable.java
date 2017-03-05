package com.entity;

/**
 * TeacherTable entity. @author MyEclipse Persistence Tools
 */

public class TeacherTable implements java.io.Serializable {

	// Fields

	private String teacherId;
	private String teacherAccount;
	private String teacherName;
	private String teacherTele;
	private String teacherSchool;

	// Constructors

	/** default constructor */
	public TeacherTable() {
	}

	/** full constructor */
	public TeacherTable(String teacherId, String teacherAccount,
			String teacherName, String teacherTele, String teacherSchool) {
		this.teacherId = teacherId;
		this.teacherAccount = teacherAccount;
		this.teacherName = teacherName;
		this.teacherTele = teacherTele;
		this.teacherSchool = teacherSchool;
	}

	// Property accessors

	public String getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherAccount() {
		return this.teacherAccount;
	}

	public void setTeacherAccount(String teacherAccount) {
		this.teacherAccount = teacherAccount;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherTele() {
		return this.teacherTele;
	}

	public void setTeacherTele(String teacherTele) {
		this.teacherTele = teacherTele;
	}

	public String getTeacherSchool() {
		return this.teacherSchool;
	}

	public void setTeacherSchool(String teacherSchool) {
		this.teacherSchool = teacherSchool;
	}

}