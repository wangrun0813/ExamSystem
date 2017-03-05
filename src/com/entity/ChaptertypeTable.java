package com.entity;

/**
 * ChaptertypeTable entity. @author MyEclipse Persistence Tools
 */

public class ChaptertypeTable implements java.io.Serializable {

	// Fields

	private Integer chaptertypeId;
	private String chaptertypeName;
	private String chaptertypeGrade;
	private String chapterName;

	// Constructors

	/** default constructor */
	public ChaptertypeTable() {
	}

	/** full constructor */
	public ChaptertypeTable(String chaptertypeName, String chaptertypeGrade,
			String chapterName) {
		this.chaptertypeName = chaptertypeName;
		this.chaptertypeGrade = chaptertypeGrade;
		this.chapterName = chapterName;
	}

	// Property accessors

	public Integer getChaptertypeId() {
		return this.chaptertypeId;
	}

	public void setChaptertypeId(Integer chaptertypeId) {
		this.chaptertypeId = chaptertypeId;
	}

	public String getChaptertypeName() {
		return this.chaptertypeName;
	}

	public void setChaptertypeName(String chaptertypeName) {
		this.chaptertypeName = chaptertypeName;
	}

	public String getChaptertypeGrade() {
		return this.chaptertypeGrade;
	}

	public void setChaptertypeGrade(String chaptertypeGrade) {
		this.chaptertypeGrade = chaptertypeGrade;
	}

	public String getChapterName() {
		return this.chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

}