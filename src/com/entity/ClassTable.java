package com.entity;

/**
 * ClassTable entity. @author MyEclipse Persistence Tools
 */

public class ClassTable implements java.io.Serializable {

	// Fields

	private Integer classId;
	private String className;
	private String classSchool;
	private String teacherId;

	// Constructors

	/** default constructor */
	public ClassTable() {
	}

	/** full constructor */
	public ClassTable(String className, String classSchool, String teacherId) {
		this.className = className;
		this.classSchool = classSchool;
		this.teacherId = teacherId;
	}

	// Property accessors

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassSchool() {
		return this.classSchool;
	}

	public void setClassSchool(String classSchool) {
		this.classSchool = classSchool;
	}

	public String getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

}