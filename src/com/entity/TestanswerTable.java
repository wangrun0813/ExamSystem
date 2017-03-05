package com.entity;

/**
 * TestanswerTable entity. @author MyEclipse Persistence Tools
 */

public class TestanswerTable implements java.io.Serializable {

	// Fields

	private Integer testanswerId;
	private ExampaperTable exampaperTable;
	private StudentTable studentTable;
	private String studentChooseanswer;
	private String subjectGrade;
	private String objectGrage;
	private String grade;
	private String wrongNumber;
	private String studentBlankanswer;
	private String studentReadinganswer;
	private String correctpaper;

	// Constructors

	/** default constructor */
	public TestanswerTable() {
	}

	/** minimal constructor */
	public TestanswerTable(ExampaperTable exampaperTable,
			StudentTable studentTable) {
		this.exampaperTable = exampaperTable;
		this.studentTable = studentTable;
	}

	/** full constructor */
	public TestanswerTable(ExampaperTable exampaperTable,
			StudentTable studentTable, String studentChooseanswer,
			String subjectGrade, String objectGrage, String grade,
			String wrongNumber, String studentBlankanswer,
			String studentReadinganswer, String correctpaper) {
		this.exampaperTable = exampaperTable;
		this.studentTable = studentTable;
		this.studentChooseanswer = studentChooseanswer;
		this.subjectGrade = subjectGrade;
		this.objectGrage = objectGrage;
		this.grade = grade;
		this.wrongNumber = wrongNumber;
		this.studentBlankanswer = studentBlankanswer;
		this.studentReadinganswer = studentReadinganswer;
		this.correctpaper = correctpaper;
	}

	// Property accessors



	public Integer getTestanswerId() {
		return this.testanswerId;
	}

	public void setTestanswerId(Integer testanswerId) {
		this.testanswerId = testanswerId;
	}

	public ExampaperTable getExampaperTable() {
		return this.exampaperTable;
	}

	public void setExampaperTable(ExampaperTable exampaperTable) {
		this.exampaperTable = exampaperTable;
	}

	public StudentTable getStudentTable() {
		return this.studentTable;
	}

	public void setStudentTable(StudentTable studentTable) {
		this.studentTable = studentTable;
	}

	public String getStudentChooseanswer() {
		return this.studentChooseanswer;
	}

	public void setStudentChooseanswer(String studentChooseanswer) {
		this.studentChooseanswer = studentChooseanswer;
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

	public String getStudentBlankanswer() {
		return this.studentBlankanswer;
	}

	public void setStudentBlankanswer(String studentBlankanswer) {
		this.studentBlankanswer = studentBlankanswer;
	}

	public String getStudentReadinganswer() {
		return this.studentReadinganswer;
	}

	public void setStudentReadinganswer(String studentReadinganswer) {
		this.studentReadinganswer = studentReadinganswer;
	}

	public String getCorrectpaper() {
		return this.correctpaper;
	}

	public void setCorrectpaper(String correctpaper) {
		this.correctpaper = correctpaper;
	}

}