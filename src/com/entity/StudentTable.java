package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * StudentTable entity. @author MyEclipse Persistence Tools
 */

public class StudentTable implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private String studentAccount;
	private String studentName;
	private String studentTele;
	private String examLimit;
	private Integer className;
	private String wrongNumber;
	private Set testanswerTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public StudentTable() {
	}

	/** minimal constructor */
	public StudentTable(Integer studentId, String studentAccount) {
		this.studentId = studentId;
		this.studentAccount = studentAccount;
	}

	/** full constructor */
	public StudentTable(Integer studentId, String studentAccount,
			String studentName, String studentTele, String examLimit,
			Integer className, String wrongNumber, Set testanswerTables) {
		this.studentId = studentId;
		this.studentAccount = studentAccount;
		this.studentName = studentName;
		this.studentTele = studentTele;
		this.examLimit = examLimit;
		this.className = className;
		this.wrongNumber = wrongNumber;
		this.testanswerTables = testanswerTables;
	}

	// Property accessors

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentAccount() {
		return this.studentAccount;
	}

	public void setStudentAccount(String studentAccount) {
		this.studentAccount = studentAccount;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentTele() {
		return this.studentTele;
	}

	public void setStudentTele(String studentTele) {
		this.studentTele = studentTele;
	}

	public String getExamLimit() {
		return this.examLimit;
	}

	public void setExamLimit(String examLimit) {
		this.examLimit = examLimit;
	}

	public Integer getClassName() {
		return this.className;
	}

	public void setClassName(Integer className) {
		this.className = className;
	}

	public String getWrongNumber() {
		return this.wrongNumber;
	}

	public void setWrongNumber(String wrongNumber) {
		this.wrongNumber = wrongNumber;
	}

	public Set getTestanswerTables() {
		return this.testanswerTables;
	}

	public void setTestanswerTables(Set testanswerTables) {
		this.testanswerTables = testanswerTables;
	}

}