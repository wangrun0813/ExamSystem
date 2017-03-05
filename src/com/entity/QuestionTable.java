package com.entity;

/**
 * QuestionTable entity. @author MyEclipse Persistence Tools
 */

public class QuestionTable implements java.io.Serializable {

	// Fields

	private Integer exampaperNumber;
	private String chapterName;
	private String chapterTypeName;
	private String question;
	private String mykey;
	private String achoose;
	private String bcchoose;
	private String ccchoose;
	private String dchoose;
	private String trueexplain;
	private String timekey;
	private String readingtext;

	// Constructors

	/** default constructor 
	 * @param timekey1 
	 * @param readingtext2 
	 * @param chapterTypeName2 
	 * @param chapterName2 */

	/** full constructor */
	public QuestionTable(String chapterName, String chapterTypeName,
			String question, String mykey, String achoose, String bcchoose,
			String ccchoose, String dchoose, String trueexplain,
			String timekey, String readingtext) {
		this.chapterName = chapterName;
		this.chapterTypeName = chapterTypeName;
		this.question = question;
		this.mykey = mykey;
		this.achoose = achoose;
		this.bcchoose = bcchoose;
		this.ccchoose = ccchoose;
		this.dchoose = dchoose;
		this.trueexplain = trueexplain;
		this.timekey = timekey;
		this.readingtext = readingtext;
	}

	// Property accessors
	public QuestionTable(){
		
	}

	public QuestionTable(String question1, String achoose1, String bcchoose1,
			String ccchoose1, String dchoose1, String mykey1,
			String trueexplain1) {
		this.question=question1;
		this.achoose=achoose1;
		this.bcchoose=bcchoose1;
		this.ccchoose=ccchoose1;
		this.dchoose=dchoose1;
		this.mykey=mykey1;
		this.trueexplain=trueexplain1;
		// TODO Auto-generated constructor stub
	}


	

	public QuestionTable(String chapterName, String chapterTypeName,
			String readingtext, String timekey) {
		// TODO Auto-generated constructor stub
		this.chapterName = chapterName;
		this.chapterTypeName = chapterTypeName;
		this.readingtext = readingtext;
		this.timekey = timekey;
	}

	public Integer getExampaperNumber() {
		return this.exampaperNumber;
	}

	public void setExampaperNumber(Integer exampaperNumber) {
		this.exampaperNumber = exampaperNumber;
	}

	public String getChapterName() {
		return this.chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getChapterTypeName() {
		return this.chapterTypeName;
	}

	public void setChapterTypeName(String chapterTypeName) {
		this.chapterTypeName = chapterTypeName;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getMykey() {
		return this.mykey;
	}

	public void setMykey(String mykey) {
		this.mykey = mykey;
	}

	public String getAchoose() {
		return this.achoose;
	}

	public void setAchoose(String achoose) {
		this.achoose = achoose;
	}

	public String getBcchoose() {
		return this.bcchoose;
	}

	public void setBcchoose(String bcchoose) {
		this.bcchoose = bcchoose;
	}

	public String getCcchoose() {
		return this.ccchoose;
	}

	public void setCcchoose(String ccchoose) {
		this.ccchoose = ccchoose;
	}

	public String getDchoose() {
		return this.dchoose;
	}

	public void setDchoose(String dchoose) {
		this.dchoose = dchoose;
	}

	public String getTrueexplain() {
		return this.trueexplain;
	}

	public void setTrueexplain(String trueexplain) {
		this.trueexplain = trueexplain;
	}

	public String getTimekey() {
		return this.timekey;
	}

	public void setTimekey(String timekey) {
		this.timekey = timekey;
	}

	public String getReadingtext() {
		return this.readingtext;
	}

	public void setReadingtext(String readingtext) {
		this.readingtext = readingtext;
	}

}