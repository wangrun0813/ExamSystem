package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * ExampaperTable entity. @author MyEclipse Persistence Tools
 */

public class ExampaperTable implements java.io.Serializable {

	// Fields

	private Integer exampaperId;
	private String exampaperName;
	private String exampaperTime;
	private Double fullgrade;
	private String chooseNumb;
	private Double passgrade;
	private String choosegrade;
	private String blankgrade;
	private String readinggrade;
	private String joinclass;
	private String blankNumb;
	private String readingNumb;
	private Set testanswerTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public ExampaperTable() {
	}

	/** full constructor */
	public ExampaperTable(String exampaperName, String exampaperTime,
			Double fullgrade, String chooseNumb, Double passgrade,
			String choosegrade, String blankgrade, String readinggrade,
			String joinclass, String blankNumb, String readingNumb,
			Set testanswerTables) {
		this.exampaperName = exampaperName;
		this.exampaperTime = exampaperTime;
		this.fullgrade = fullgrade;
		this.chooseNumb = chooseNumb;
		this.passgrade = passgrade;
		this.choosegrade = choosegrade;
		this.blankgrade = blankgrade;
		this.readinggrade = readinggrade;
		this.joinclass = joinclass;
		this.blankNumb = blankNumb;
		this.readingNumb = readingNumb;
		this.testanswerTables = testanswerTables;
	}

	// Property accessors

	public ExampaperTable(Integer exampaperId) {
		// TODO Auto-generated constructor stub
		this.exampaperId=exampaperId;
	}

	public Integer getExampaperId() {
		return this.exampaperId;
	}

	public void setExampaperId(Integer exampaperId) {
		this.exampaperId = exampaperId;
	}

	public String getExampaperName() {
		return this.exampaperName;
	}

	public void setExampaperName(String exampaperName) {
		this.exampaperName = exampaperName;
	}

	public String getExampaperTime() {
		return this.exampaperTime;
	}

	public void setExampaperTime(String exampaperTime) {
		this.exampaperTime = exampaperTime;
	}

	public Double getFullgrade() {
		return this.fullgrade;
	}

	public void setFullgrade(Double fullgrade) {
		this.fullgrade = fullgrade;
	}

	public String getChooseNumb() {
		return this.chooseNumb;
	}

	public void setChooseNumb(String chooseNumb) {
		this.chooseNumb = chooseNumb;
	}

	public Double getPassgrade() {
		return this.passgrade;
	}

	public void setPassgrade(Double passgrade) {
		this.passgrade = passgrade;
	}

	public String getChoosegrade() {
		return this.choosegrade;
	}

	public void setChoosegrade(String choosegrade) {
		this.choosegrade = choosegrade;
	}

	public String getBlankgrade() {
		return this.blankgrade;
	}

	public void setBlankgrade(String blankgrade) {
		this.blankgrade = blankgrade;
	}

	public String getReadinggrade() {
		return this.readinggrade;
	}

	public void setReadinggrade(String readinggrade) {
		this.readinggrade = readinggrade;
	}

	public String getJoinclass() {
		return this.joinclass;
	}

	public void setJoinclass(String joinclass) {
		this.joinclass = joinclass;
	}

	public String getBlankNumb() {
		return this.blankNumb;
	}

	public void setBlankNumb(String blankNumb) {
		this.blankNumb = blankNumb;
	}

	public String getReadingNumb() {
		return this.readingNumb;
	}

	public void setReadingNumb(String readingNumb) {
		this.readingNumb = readingNumb;
	}

	public Set getTestanswerTables() {
		return this.testanswerTables;
	}

	public void setTestanswerTables(Set testanswerTables) {
		this.testanswerTables = testanswerTables;
	}

}