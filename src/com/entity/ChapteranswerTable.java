package com.entity;

/**
 * ChapteranswerTable entity. @author MyEclipse Persistence Tools
 */

public class ChapteranswerTable implements java.io.Serializable {

	// Fields

	private Integer chapteranswerId;
	private Integer studentId;
	private Integer chapterId;
	private String studentAnswer;
	private String subjectGrade;
	private String objectGrage;
	private String grade;
	private String wrongNumber;

	// Constructors

	/** default constructor */
	public ChapteranswerTable() {
	}

	/** minimal constructor */
	public ChapteranswerTable(Integer studentId) {
		this.studentId = studentId;
	}

	/** full constructor */
	public ChapteranswerTable(Integer studentId, Integer chapterId,
			String studentAnswer, String subjectGrade, String objectGrage,
			String grade, String wrongNumber) {
		this.studentId = studentId;
		this.chapterId = chapterId;
		this.studentAnswer = studentAnswer;
		this.subjectGrade = subjectGrade;
		this.objectGrage = objectGrage;
		this.grade = grade;
		this.wrongNumber = wrongNumber;
	}

	// Property accessors

	public Integer getChapteranswerId() {
		return this.chapteranswerId;
	}

	public void setChapteranswerId(Integer chapteranswerId) {
		this.chapteranswerId = chapteranswerId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getChapterId() {
		return this.chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}

	public String getStudentAnswer() {
		return this.studentAnswer;
	}

	public void setStudentAnswer(String studentAnswer) {
		this.studentAnswer = studentAnswer;
	}

	public String getSubjectGrade() {
		return this.subjectGrade;
	}

	public void setSubjectGrade(String subjectGrade) {
		this.subjectGrade = subjectGrade;
	}

	public String getObjectGrage() {
		return this.objectGrage;
	}

	public void setObjectGrage(String objectGrage) {
		this.objectGrage = objectGrage;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getWrongNumber() {
		return this.wrongNumber;
	}

	public void setWrongNumber(String wrongNumber) {
		this.wrongNumber = wrongNumber;
	}

}